package com.smart.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.IOException;

public class FileSourceExample {
    public static void main(String[] args) {
        /*try{*/
            String filePath = "C:\\Users\\13955\\Desktop\\" +
                    "spring\\chapter3\\src\\main\\resources\\test\\test.txt";
            WritableResource res1 = new PathResource(filePath);
            Resource res2 = new ClassPathResource("test\\test.txt");
        /*}catch (IOException e){

        }*/
    }
}
