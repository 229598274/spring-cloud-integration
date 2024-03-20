package com.example.controller;

import com.example.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class HelloWorldController {

    @Autowired
    User user;

    @GetMapping("/a")
    public String getA(){
        return user.getName();
    }
}
