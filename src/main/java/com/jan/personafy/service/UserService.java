package com.jan.personafy.service;

import com.jan.personafy.dto.UserDTO;
import com.jan.personafy.mapper.UserMapper;
import com.jan.personafy.model.User;
import com.jan.personafy.repository.UserRepository;

public class UserService implements IUserService {
    private UserRepository userRepository;
    private UserMapper userMapper;
    
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserDTO getUser(String id) {
        return userMapper.convertToDTO(userRepository.findById(id).get());
    }

    public void createUser(UserDTO userDTO) {
        User user = userMapper.convertToEntity(userDTO);
        userRepository.save(user);
    }

}
