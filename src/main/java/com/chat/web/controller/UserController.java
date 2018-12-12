package com.chat.web.controller;

import com.chat.web.entity.User;
import com.chat.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/test")
    public User getUser(@RequestParam("id") Integer id){
        return userService.getUserById(id);
    }
}
