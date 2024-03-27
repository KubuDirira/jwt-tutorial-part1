package com.kubudirira.securitydemo3.service;

import com.kubudirira.securitydemo3.model.HttpResponse;
import com.kubudirira.securitydemo3.form.LoginForm;
import com.kubudirira.securitydemo3.model.User;

public interface AuthService {

 /*   public UserDTO login(LoginForm login);

    public UserDTO register(UserDTO register);*/

    public HttpResponse login(LoginForm login);

    public HttpResponse register(User register);

}
