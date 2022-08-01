package com.example.test.service;

import com.example.test.Entity.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public UserDTO saveUser(UserDTO userDTO);
    public List<UserDTO> getAllUsers();

}
