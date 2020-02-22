package com.harry.jystore.service.impl;

import com.harry.jystore.core.AbstractService;
import com.harry.jystore.dao.UserMapper;
import com.harry.jystore.dao.UserMapperMybatis;
import com.harry.jystore.dao.UserMapperjpa;
import com.harry.jystore.entity.User;
import com.harry.jystore.service.UserService;
import com.harry.jystore.util.DateUtil;
import org.hibernate.id.UUIDGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends AbstractService<User>
        implements UserService{
    @Autowired
    UserMapper userMapper;

    @Autowired
    UserMapperMybatis userMapperMybatis;

    @Autowired
    UserMapperjpa userMapperjpa;

    /**
     * 通用mapper
     * @return
     */
    public List<User> findalls() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    /**
     * 通过Mapper映射xml来实现（mybatis）
     */
    public void update(User user) {
        userMapperMybatis.update(user);
    }

    public void add(User user){
        user.setCreateTime(DateUtil.getCurrent24DateTotal());
        user.setStatus(0);
        int insert = userMapper.insert(user);
    }

    public void delete(User user){
        userMapperjpa.delete(user);
    }
    /*public List<User> findallss() {
        List<User> users =this.findAll();
        return users;
    }*/

}
