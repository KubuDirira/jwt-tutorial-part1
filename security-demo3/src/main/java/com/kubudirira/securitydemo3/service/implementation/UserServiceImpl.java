package com.kubudirira.securitydemo3.service.implementation;

import com.kubudirira.securitydemo3.model.User;
import com.kubudirira.securitydemo3.repository.UserRepository;
import com.kubudirira.securitydemo3.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer user_id) {
        return userRepository.findById(user_id).orElseThrow();
    }

    @Override
    public void deleteUser(Integer user_id) {
        userRepository.deleteById(user_id);
    }

    @Override
    public User editUser(Integer user_id, User user) {
        //find user by id.

        //edit it with user object

        //save it

        //return it

        return null;
    }
}
