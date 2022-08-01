package com.example.test.Controller;


import com.example.test.Entity.UserDTO;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 멤버 조회
     */
    @GetMapping("user")
    public List<UserDTO> getAllUsers(){
//        System.out.println("findAll");
        return userService.getAllUsers();

    }

    @PostMapping("user")
    public String signUp(@RequestBody UserDTO user){
        System.out.println("singup 호출됨");
        userService.saveUser(user);
        return "new User";

    }
}
