package com.ycu.mall.controller;


import com.ycu.mall.entity.User;
import com.ycu.mall.service.UserService;
import com.ycu.mall.vo.ResultVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@ResponseBody
@RequestMapping("/user")
@Api(value = "提供用户添加，修改，删除及查询的相关接口",tags = "用户管理")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation("用户登录接口")

    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String",name = "username",value = "用户登录name",required = true),
            @ApiImplicitParam(dataType = "String",name = "password",value = "用户登录密码",required = true)
    })

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ResultVO login(@RequestParam("username") String name ,
                          @RequestParam(value = "password") String pwd){
        ResultVO resultVO = userService.checkLogin(name, pwd);
        return resultVO;

    }

    @ApiOperation("用户注册接口")
    @ApiImplicitParams({
            @ApiImplicitParam(dataType = "String",name = "name",value = "用户注册姓名",required = true),
            @ApiImplicitParam(dataType = "String",name = "pwd",value = "用户注册密码",required = true)
    })
//    @ApiImplicitParam(name = "用户信息",required = true)
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    public ResultVO regist(String name ,String pwd){
        ResultVO resultVO = userService.userRegist(name, pwd);
        return resultVO;

    }
}
