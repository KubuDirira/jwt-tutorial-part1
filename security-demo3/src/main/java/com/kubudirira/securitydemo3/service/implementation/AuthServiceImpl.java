package com.kubudirira.securitydemo3.service.implementation;

import com.kubudirira.securitydemo3.Util.JwtUtils;
import com.kubudirira.securitydemo3.model.HttpResponse;
import com.kubudirira.securitydemo3.form.LoginForm;
import com.kubudirira.securitydemo3.model.User;
import com.kubudirira.securitydemo3.repository.UserRepository;
import com.kubudirira.securitydemo3.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.CREATED;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private JwtUtils jwtUtils;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private AuthenticationManager authenticationManager;



    @Override
    public HttpResponse login(LoginForm login){

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(login.getEmail(),login.getPassword()));
        var user = userRepository.findByEmail(login.getEmail()).orElseThrow();
        System.out.println("USER IS: "+ user);
        var jwt = jwtUtils.generateToken(user);

        return  HttpResponse.builder()
                .timeStamp(LocalTime.now().toString())
                .token(jwt)
                .message("Login Successful")
                .status(HttpStatus.OK)
                .statusCode(HttpStatus.OK.value())
                .build();


    }
    @Override
    public HttpResponse register(User register){
        User savedUser;
        User user = User.builder()
                .email(register.getEmail())
                .password(passwordEncoder.encode(register.getPassword()))
                .role(register.getRole()).build();

        try{
            savedUser = userRepository.save(user);
        }catch (Exception e){
            return  HttpResponse.builder()
                    .timeStamp(now().toString())
                    .message(e.getMessage())
                    .developerMessage("Email already exist")
                    .build();

        }


        return  HttpResponse.builder()
                .timeStamp(now().toString())
                .data(of("user", savedUser))
                .message("User created")
                .status(CREATED)
                .statusCode(CREATED.value())
                .build();


    }
}
