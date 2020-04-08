package com.lv.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/*
* 整合mybatis plus
* 1. 导入依赖
*   my-batis-plus-boot-starter
* 2. 配置
*   1. 导入驱动 eg mysql-connector
*   2. application.yml
* 3. 配置mybatis plus
*   1. @MapperScan("com.lv.gulimall.product.dao")
*   2. 配置mapper文件
* */
@MapperScan("com.lv.gulimall.product.dao")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
