package com.nextlevel.codecamp.webapp.dog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nextlevel.codecamp.model.dog.Dog;

@Service
public class DogService {
	
	private static String DOG_SERVICE_URL = "http://dog-service/dogs";
	
	@Autowired
	@LoadBalanced
	private RestTemplate restTemplate;
	
	public List<Dog> getDogs() {
		return restTemplate.getForObject(DOG_SERVICE_URL, List.class);
	}
	
	public Dog createDog(Dog dog) {
		return restTemplate.postForObject(DOG_SERVICE_URL, dog, Dog.class);
	}

}
