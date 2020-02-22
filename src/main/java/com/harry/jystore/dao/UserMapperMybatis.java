package com.harry.jystore.dao;

import com.harry.jystore.entity.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapperMybatis {
    void update(User user);
}
