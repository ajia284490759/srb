package com.atguigu.srb.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Title:
 * @Desription:
 * @Company:
 * @ClassName:ServiceCoreApplication
 * @Author: laj
 * @CreateDate: 2022/1/24 22:50
 * @UpdateUser:
 * @Version:1.0
 */
@SpringBootApplication
@ComponentScan({"com.atguigu.srb", "com.atguigu.common"})
public class ServiceCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceCoreApplication.class,args);
    }

}
