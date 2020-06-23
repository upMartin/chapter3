package com.smart.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.WritableResource;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileSourceExample {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\13955\\Desktop\\" +
                    "spring\\chapter3\\src\\main\\resources\\test\\test.txt";
            WritableResource res1 = new PathResource(filePath);
            Resource res2 = new ClassPathResource("test\\test.txt");
            OutputStream stream1 = res1.getOutputStream();
            stream1.write("hello world".getBytes());
            stream1.close();

            //
            InputStream ins1 = res1.getInputStream();
            InputStream ins2 = res2.getInputStream();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int i = 0;
            while ((i=ins1.read())!=-1){
                baos.write(i);
            }
            System.out.println(baos.toString());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
