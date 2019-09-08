package com.miaosha.miaosha;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.miaosha.miaosha"})
@MapperScan("com.miaosha.miaosha.dao")
public class MiaoshaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

}
