package com.shishupal.FirstProject.controller;

import com.shishupal.FirstProject.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User findByUserName(String userName) {
        // Mock implementation for demonstration purposes
        User user = new User();
        user.setUserName(userName);
        return user;
    }

    public void saveUser(User user) {
    }
}
