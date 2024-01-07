package com.jan.personafy.service;
import com.jan.personafy.dto.UserDTO;


public interface IUserService {
    
    public UserDTO getUser(String id);

    public void createUser(UserDTO userDTO);
}
