package com.ycu.mall.service;

import com.ycu.mall.entity.User;
import com.ycu.mall.vo.ResultVO;

public interface UserService {
    public ResultVO checkLogin(String name, String pwd);
    public ResultVO userRegist(String name, String pwd);
}
