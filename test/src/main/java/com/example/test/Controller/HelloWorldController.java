package com.example.test.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    @CrossOrigin
    public String test() {
        System.out.println("1");

        return "Hello, world111!";
    }

}