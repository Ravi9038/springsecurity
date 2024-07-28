package com.springsecurity.services;

import com.springsecurity.entities.User;
import com.springsecurity.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;
    public List<User> getUserData() {
        return userRepository.findAll();
    }
}
