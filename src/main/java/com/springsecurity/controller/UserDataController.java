package com.springsecurity.controller;

import com.springsecurity.entities.User;
import com.springsecurity.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserDataController {

    @Autowired
    UserService userService;
    @GetMapping("/user")
    public List<User> getUserData(){
        return userService.getUserData();
    }

}
