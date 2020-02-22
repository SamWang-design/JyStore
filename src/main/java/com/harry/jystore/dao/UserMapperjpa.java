package com.harry.jystore.dao;

import com.harry.jystore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;



@Component
public interface UserMapperjpa extends JpaRepository<User,Integer> {
}
