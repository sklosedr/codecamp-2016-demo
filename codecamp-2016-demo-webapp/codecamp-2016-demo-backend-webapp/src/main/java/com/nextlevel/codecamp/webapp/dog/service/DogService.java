package com.nextlevel.codecamp.webapp.dog.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.nextlevel.codecamp.model.dog.Dog;

@Service
public class DogService {
	
	private static String DOG_SERVICE_URL = "http://localhost:8081/dogs";
	
	private RestTemplate restTemplate;
	
	@PostConstruct
	public void init() {
		restTemplate = new RestTemplate();
	}
	
	public List<Dog> getDogs() {
		return restTemplate.getForObject(DOG_SERVICE_URL, List.class);
	}
	
	public Dog createDog(Dog dog) {
		return restTemplate.postForObject(DOG_SERVICE_URL, dog, Dog.class);
	}

}
