package com.smart.beanfactory;

import com.smart.domain.Car;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessorBeforeInitialization(Object bean, String beanName){
        if (beanName.equals("car")){
            Car car = (Car)bean;
            if (car.getColor()==null){
                System.out.println("调用BeanPostProcessor." +
                        "postProcessorBeforeInitialization(),color为空, 设置为默认黑色");
                car.setColor("黑色");
            }
        }
        return bean;
    }


    public Object postProcessorAfterInitialization(Object bean, String beanName){
        if (beanName.equals("car")){
            Car car = (Car)bean;
            if (car.getMaxSpeed()>=200){
                System.out.println("调用BeanPostProcessor." +
                        "postProcessorAfterInitialization(),将maxSpeed设置为200");
                car.setMaxSpeed(200);
            }
        }
        return bean;
    }
}
