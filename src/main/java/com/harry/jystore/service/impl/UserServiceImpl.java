package com.harry.jystore.service.impl;

import com.harry.jystore.core.AbstractService;
import com.harry.jystore.dao.UserMapper;
import com.harry.jystore.entity.User;
import com.harry.jystore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService<User> implements UserService{
    @Autowired
    UserMapper userMapper;

    public List<User> findalls() {
        List<User> users = userMapper.selectAll();
        return users;
    }
    public List<User> findallss() {
        List<User> users =this.findAll();
        return users;
    }
}
