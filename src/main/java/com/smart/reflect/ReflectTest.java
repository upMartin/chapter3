package com.smart.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectTest {
    public static Car initByDefaultConst() throws Throwable{
        //1.通过类加载器获取Car类对象
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class c = classLoader.loadClass("com.smart.reflect.Car");
        //2.获取类的默认构造器对象并通过它实例化Car
        Constructor con = c.getDeclaredConstructor();
        Car car = (Car) con.newInstance();
        //3.通过反射方法设置属性
        Method setBrand = c.getDeclaredMethod("setBrand", String.class);
        setBrand.invoke(car, "奔驰");

        Method setColor = c.getDeclaredMethod("setColor", String.class);
        setColor.invoke(car, "蓝色");
        Method setMaxSpeed = c.getDeclaredMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 200);
        return car;
    }

    public static void main(String[] args) throws Throwable {
        Car car = initByDefaultConst();
        car.introduce();
    }
}
