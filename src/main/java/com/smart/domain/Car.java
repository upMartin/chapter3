package com.smart.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Car implements BeanFactoryAware, BeanNameAware, InitializingBean, DisposableBean {
    private String brand;
    private String color;
    private int maxSpeed;

    private BeanFactory beanFactory;
    private String beanName;

    public Car(){
        System.out.println("调用Car()构造函数");
    }

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void introduce(){
        System.out.println("brand:"+brand+";color:"+color+";maxSpeed:"+maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        System.out.println("调用setBrand()设置属性");
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    //2.BeanFactoryAware接口方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("调用BeanFactory.setBeanFactory().");
        this.beanFactory = beanFactory;
    }

    //3. BeanNameAware接口方法
    @Override
    public void setBeanName(String beanName) {
        System.out.println("调用BeanFactory.setBeanName().");
        this.beanName = beanName;
    }
    //5.DisposableBean接口方法
    @Override
    public void destroy() throws Exception {
        System.out.println("调用DisposableBean.destroy().");
    }

    //4.InitializingBean接口方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("调用InitializingBean.afterPropertiesSet().");
    }

    //6
    public void myInit(){
        System.out.println("调用init-method所指定的myInit(), 将maxSpeed设置为240.");
        this.maxSpeed=240;
    }

    //7
    public void myDestroy(){
        System.out.println("调用destroy-method所指定的myDestroy().");
    }
}
