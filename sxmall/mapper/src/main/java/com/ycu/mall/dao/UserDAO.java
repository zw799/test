package com.ycu.mall.dao;

import com.ycu.mall.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO {
    public User queryUserByName(String name);
    public int insertUser(User user);
}

