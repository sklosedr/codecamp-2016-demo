package com.nextlevel.codecamp.service.dog;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;

import com.nextlevel.codecamp.model.dog.Dog;

@Configuration
@EntityScan(basePackageClasses=Dog.class)
public class DogServiceConfiguration {

}
