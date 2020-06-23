package com.smart.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

public class PatternResolverTest {

    public static void main(String[] args) throws IOException {
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] re = resolver.getResources("classpath:/**/*.xml");
        for (Resource resource : re){
            System.out.println(resource.getDescription());
        }
    }
}

