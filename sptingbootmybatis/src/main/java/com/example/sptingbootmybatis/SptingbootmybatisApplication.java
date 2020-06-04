package com.example.sptingbootmybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SptingbootmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptingbootmybatisApplication.class, args);
    }

}
