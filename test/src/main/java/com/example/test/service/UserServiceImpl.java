package com.example.test.service;

import com.example.test.Entity.UserDTO;
import com.example.test.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return userRepository.save(userDTO);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll();
    }
}
