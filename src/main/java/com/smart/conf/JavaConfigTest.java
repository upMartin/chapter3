package com.smart.conf;
import com.smart.domain.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConf.class);
        Car car = (Car) ctx.getBean("car");
        car.introduce();
    }
}
