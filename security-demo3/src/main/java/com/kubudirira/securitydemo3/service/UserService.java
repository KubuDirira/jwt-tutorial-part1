package com.kubudirira.securitydemo3.service;

import com.kubudirira.securitydemo3.model.User;

import java.util.List;

public interface UserService {

    /**
     * Creating a User
     */

    public User addUser(User user);

    /**
     * Get a List of User
     */

    public List<User> getUsers();

    /**
     * Get User by ID
     * @param user_id must not be {@literal null}.
     * @return a reference to the entity with the given identifier.
     */
    public User getUserById(Integer user_id);


    /**
     * Get User by ID
     * @param user_id must not be {@literal null}.
     */
    public void deleteUser(Integer user_id);

    /**
     * Get User by ID
     * @param user_id   must not be {@literal null}.
     * @param user   must not be {@literal null}.
     * @return a reference to the entity with the given identifier.
     */

    public User editUser(Integer user_id, User user);
}
