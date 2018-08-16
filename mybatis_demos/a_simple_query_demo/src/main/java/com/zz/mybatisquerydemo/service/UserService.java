package com.zz.mybatisquerydemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zz.mybatisquerydemo.dao.UserMapper;
import com.zz.mybatisquerydemo.entity.User;

@Service
public class UserService {

    @Autowired
    public UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }
}
