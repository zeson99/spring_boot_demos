package com.zz.mybatisquerydemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zz.mybatisquerydemo.entity.User;
import com.zz.mybatisquerydemo.service.UserService;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{id}")
    public User userdetail(@PathVariable int id) {
        User u = userService.findById(id);
        return u;
    }
}