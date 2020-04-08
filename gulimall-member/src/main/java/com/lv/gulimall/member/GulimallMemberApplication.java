package com.lv.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
* 远程调用
*   1. 引入 Open Feign
*   2. 编写接口
*   3. 生命每一个方法是调用的哪里
*   4. 开启*/
@EnableFeignClients(basePackages = "com.lv.gulimall.member.feign")
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
