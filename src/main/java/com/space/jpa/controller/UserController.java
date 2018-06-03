package com.space.jpa.controller;

import com.space.jpa.bean.User;
import com.space.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhuzhe
 * @date 2018/6/3 23:43
 * @email 1529949535@qq.com
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<User> findAll() {
        return userService.findAll();
    }
}
