package com.smart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Chapter3Application {

    @RequestMapping("/")
    public String index(){
        return "Hello world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Chapter3Application.class, args);
    }

}
