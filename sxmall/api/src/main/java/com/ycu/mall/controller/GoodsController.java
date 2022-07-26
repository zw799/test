package com.ycu.mall.controller;


import com.ycu.mall.vo.ResultVO;
import io.swagger.annotations.Api;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.sql.SQLOutput;

//@Controller
//@ResponseBody

@RestController //==@Controllerv+@ResponseBody+....
@RequestMapping("/goods")
@Api(value = "提供商品添加，修改，删除及查询的相关接口",tags = "商品管理")
public class GoodsController {

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public ResultVO addGoods(){
        return null;
    };


    @RequestMapping(value = "/{gid}",method = RequestMethod.DELETE)
    public ResultVO deleteGoods(@PathVariable("gid") int goodID){
        //System.out.println("-------------"+goodID+"-------------");
        System.out.println("Delete");
        return new ResultVO(10001,"hahah","Delete");
    };

    @ApiIgnore
    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResultVO updateGoods(){
        return null;
    };


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public ResultVO lsitGoods(){
        return null;
    };

    @RequestMapping(value = "/{gid}",method = RequestMethod.GET)
    public ResultVO getGoods(@PathVariable("gid") int goodID){

        System.out.println("getGoods");
        return new ResultVO(10001,"hahah","getGoods");

    };

}
