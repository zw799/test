package com.ycu.mall.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /*swagger会帮助我们生成接口文档来
    *       1:配置生成的文档信息
     *      2:配置生成规则
    Docket封装接口文档信息!*/


    @Bean
    public Docket gerDocket(){

        //创建封面对象
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("接口说明")
                      .version("V 2.0.1")
                      .contact(new Contact("哈哈哈","hahahahhah","hahhhahahah@hahaha.com"));
        ApiInfo apiInfo = apiInfoBuilder.build();
        //如何获取一个接口1/抽象类对象
        // new接口l，需要在构造器后的}实现接口中的所有抽象方法/l / new子类/实现类
        //工厂模式

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)//指定生成的文档中的封面信息:文档标题、版本、作者
                .select()//生成策略
                .apis(RequestHandlerSelectors.basePackage("com.ycu.mall.controller"))//为指定控制器产生接口文档
                .paths(PathSelectors.any())// .regex("/user/")) 只会为user开头的生成文档
                .build();

        return docket;
    }
}
