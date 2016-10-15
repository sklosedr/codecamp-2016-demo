package com.nextlevel.codecamp.webapp.dog.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.nextlevel.codecamp.model.dog.Dog;

@Service
public class DogService {
	
	private static Long LAST_ID = 0L;
	private List<Dog> dogs = new ArrayList<>();
	
	@PostConstruct
	private void init() {
		initDog(getNextId(), "Porter", "Very ipsum such dolor amet wow very divs very content", "wood", false);
		initDog(getNextId(), "Mal", "Very ipsum such dolor amet wow very divs very content", "balls", true);
	}
	
	private Long getNextId() {
		LAST_ID++;
		return LAST_ID;
	}
	
	private void initDog(Long id, String name, String description, String favoriteToy, boolean goodDog) {
		Dog dog = new Dog();
		dog.setId(id);
		dog.setName(name);
		dog.setDescription(description);
		dog.setFavoriteToy(favoriteToy);
		dog.setGoodDog(goodDog);
		dogs.add(dog);
	}
	
	public List<Dog> getDogs() {
		return dogs;
	}
	
	public Dog createDog(Dog dog) {
		dog.setId(getNextId());
		dogs.add(dog);
		return dog;
	}

}
