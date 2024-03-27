package com.kubudirira.securitydemo3.auth;


import com.kubudirira.securitydemo3.model.HttpResponse;
import com.kubudirira.securitydemo3.form.LoginForm;
import com.kubudirira.securitydemo3.model.User;
import com.kubudirira.securitydemo3.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.time.LocalDateTime.now;
import static java.util.Map.of;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<HttpResponse> register(@RequestBody User registerRequest){
        return ResponseEntity.ok(authService.register(registerRequest));
    }
    @PostMapping("/login")
    public ResponseEntity<HttpResponse> login(@RequestBody LoginForm loginRequest) {

        return ResponseEntity.ok(authService.login(loginRequest));
    }
}
