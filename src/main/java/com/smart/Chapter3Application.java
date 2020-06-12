package com.smart;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan(basePackages = {"com.smart.dao"})
@EnableTransactionManagement
public class Chapter3Application {

    @RequestMapping("/")
    public String index(){
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter3Application.class, args);
    }

}
