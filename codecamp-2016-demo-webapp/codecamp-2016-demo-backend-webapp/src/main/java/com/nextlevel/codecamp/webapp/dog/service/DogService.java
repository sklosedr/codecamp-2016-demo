package com.nextlevel.codecamp.webapp.dog.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nextlevel.codecamp.model.dog.Dog;

@Service
public class DogService {
	
	private List<Dog> dogs = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		Dog dog = new Dog();
		dog.setName("Porter");
		dog.setDescription("Very ipsum such dolor amet wow very divs very content");
		dog.setFavoriteToy("wood");
		dog.setGoodDog(false);
		dogs.add(dog);
		
		Dog dog2 = new Dog();
		dog2.setName("Mal");
		dog2.setDescription("Very ipsum such dolor amet wow very divs very content");
		dog2.setFavoriteToy("balls");
		dog2.setGoodDog(true);
		dogs.add(dog2);
	}
	
	public List<Dog> getDogs() {
		return dogs;
	}
	
	public Dog createDog(Dog dog) {
		dogs.add(dog);
		return dog;
	}

}
