package com.ycu.mall.entity;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "User对象",description = "用户/卖家信息")

public class User {

//    user_id	int	主键id 用户id
//    username	varchar	用户名 用户名
//    password	varchar	密码 密码
//    nickname	varchar	昵称 昵称
//    realname	varchar	真实姓名 真实姓名
//    user_img	varchar	头像 头像
//    user_mobile	varchar	手机号 手机号
//    user_email	varchar	邮箱地址 邮箱地址
//    user_sex	char	性别 M(男) or F(女)
//    user_birth	date	生日 生日
//    user_regtime	datetime	注册时间 创建时间
//    user_modtime	datetime	更新时间 更新时间

    private int userId;
    private String username;
    private String password;
    private String nickname;
    private String realname;
    private String userImg;
    private String userMobile;
    private String userEmail;
    private String userSex;
    private Date userBirth;
    private Date userRegtime;
    private Date userModtime;





}
