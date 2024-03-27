package com.kubudirira.securitydemo3.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.kubudirira.securitydemo3.model.User;
import com.kubudirira.securitydemo3.role.Role;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.List;


@Data

public class UserDTO {

    private String email;

    @Enumerated(EnumType.STRING)
    private Role role;

}
