package com.kubudirira.securitydemo3.form;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class LoginForm {
    @NotEmpty
    private String email;
    @NotEmpty
    private String password;
}
