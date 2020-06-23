package com.smart.beanfactory;

import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor extends
        InstantiationAwareBeanPostProcessorAdapter {

    //1.接口方法: 在实例化Bean前调用
    public Object postProcessBeforeInstantiation(Class beanClass, String beanName){
        if ("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessor. postProcessBeforeInstantiation");
        }
        return null;
    }

    //2.接口方法: 在实例化Bean后调用
    public boolean postProcessAfterInstantiation(Object bean, String beanName){
        if ("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessor. postProcessAfterInstantiation");
        }
        return true;
    }

    //3.接口方法: 在设置某个属性时调用
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds,
    Object bean, String beanName){
        if ("car".equals(beanName)){
            System.out.println("InstantiationAwareBeanPostProcessor. postProcessPropertyValues");
        }
        return pvs;
    }

}
