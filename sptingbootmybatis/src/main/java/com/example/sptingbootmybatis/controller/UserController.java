package com.example.sptingbootmybatis.controller;

import com.example.sptingbootmybatis.entity.User;
import com.example.sptingbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService service;

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        User user = service.getUserById(id);

        return user;
    }
}
