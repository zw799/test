package com.ycu.dao;

import com.ycu.ApiApplication;
import com.ycu.mall.dao.UserDAO;
import com.ycu.mall.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = ApiApplication.class)
//public class UserDAOTest {
//
//    @Resource
//    private UserDAO userDAO;
//
//    @Test
//    public void queryUserByID(){
//        User user = userDAO.queryUserByID(2);
//        System.out.println(user);
//    }
//
//
//
//}