package com.example.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@EnableAutoConfiguration
@Configuration
public class Config {

    @Bean
    public User User(){
        User user = new User();
        user.setName("77777");
        return user;
    }
}
