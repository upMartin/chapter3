package com.smart.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppliManager {
    @Value("#{appConf.name}")
    private String name;

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConf.class,AppliManager.class);
        AppliManager appliManager = (AppliManager) context.getBean("appliManager");
        System.out.println(appliManager.name);
    }

}
