package com.system.spi.test;

import com.sun.tools.javac.util.ServiceLoader;
import com.system.spi.DogService;


public class Test {

    public static void main(String[] args) throws Exception {
        ServiceLoader<DogService> loaders = ServiceLoader.load(DogService.class);

        for (DogService d : loaders) {
            d.sleep();
        }
    }
}