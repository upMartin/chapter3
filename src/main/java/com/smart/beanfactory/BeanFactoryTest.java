package com.smart.beanfactory;

import com.smart.domain.Car;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.beans.PropertyEditor;
import java.io.IOException;

public class BeanFactoryTest {
    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource resource = resolver.getResource("classpath:/bean/beans.xml");
        System.out.println(resource.getURL());

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
        reader.loadBeanDefinitions(resource);
        System.out.println("init BeanFactory");
        Car car = factory.getBean("car1", Car.class);
        car.introduce();
    }
}
