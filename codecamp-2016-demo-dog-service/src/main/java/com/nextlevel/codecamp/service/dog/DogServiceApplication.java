package com.nextlevel.codecamp.service.dog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DogServiceApplication {

    public static void main(String[] args) {
    	System.setProperty("spring.config.name", "dog-server");
        SpringApplication.run(DogServiceApplication.class, args);
    }
}
