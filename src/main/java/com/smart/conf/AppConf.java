package com.smart.conf;

import com.smart.domain.Car;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/bean/config.properties")
public class AppConf {
    private String name;

    @Bean
    public Car car(){
        System.out.println(name);
        return new Car();
    }

    public String getName() {
        name = "胡凌云";
        return name;
    }
}
