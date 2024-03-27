package com.kubudirira.securitydemo3.dto;



import com.kubudirira.securitydemo3.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO convertUsertoUserDTO(User user){
        return modelMapper.map(user, UserDTO.class);

    }

    public User convertUserDTOtoUser(UserDTO userDTO){
        return modelMapper.map(userDTO,User.class);
    }
}
