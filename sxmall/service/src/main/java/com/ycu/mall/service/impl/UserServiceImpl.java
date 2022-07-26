package com.ycu.mall.service.impl;

import com.ycu.mall.dao.UserDAO;
import com.ycu.mall.entity.User;
import com.ycu.mall.service.UserService;
import com.ycu.mall.utils.MD5Utils;
import com.ycu.mall.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public ResultVO checkLogin(String name, String pwd) {

        User user = userDAO.queryUserByName(name);
        if (user == null){
            return new ResultVO(1000,"登录失败，用户不存在",null);
        }else {
            String md5Pwd = MD5Utils.md5(pwd);
            if (md5Pwd.equals(user.getPassword())){
                return new ResultVO(1001,"登录成功",user);
            }else {
                return new ResultVO(1000,"登录失败，密码错误",null);
            }
        }
    }

    @Override
    @Transactional
    public ResultVO userRegist(String name, String pwd) {
        synchronized (this) {
            //1.根据⽤户查询，这个⽤户是否已经被注册
            User user = userDAO.queryUserByName(name);
            //如果没有被注册则进行保存操作
            if (user == null) {
                String md5Pwd = MD5Utils.md5(pwd);

                user = new User();
                user.setPassword(md5Pwd);
                user.setUsername(name);
                user.setUserImg("aaa.jpg");
                user.setUserRegtime(new Date());
                user.setUserModtime(new Date());
                int i = userDAO.insertUser(user);
                if (i > 0) {
                    return new ResultVO(1001, "注册成功", user);
                } else {
                    return new ResultVO(1000, "注册失败", null);
                }
            } else {
                return new ResultVO(1000, "用户已存在", null);

            }
        }
    }


}
