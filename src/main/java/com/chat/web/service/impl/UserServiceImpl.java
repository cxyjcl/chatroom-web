package com.chat.web.service.impl;

import com.chat.web.dao.UserMapper;
import com.chat.web.entity.User;
import com.chat.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
