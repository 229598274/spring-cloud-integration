package com.example.controller;

import com.example.config.Demo;
import com.example.config.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController

public class HelloWorldController {

//    @Value("${demo.name}")
//    String name;
//    @Autowired
//    User user;

    @GetMapping("/a")
    public String getA(){
        return "1111";
    }
//    @GetMapping("/demo")
//    public String getDemo(){
//        return demo.getName();
//    }

    @GetMapping("/message")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String getMessage(){
        return "message";
    }
//    @GetMapping("/demo")
//    public String getDemo(){
//        return demo.getName();
//    }
}
