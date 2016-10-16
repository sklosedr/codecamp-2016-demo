package com.nextlevel.codecamp.service.dog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nextlevel.codecamp.model.dog.Dog;
import com.nextlevel.codecamp.service.dog.service.DogService;

@RestController
@RequestMapping("/dogs")
public class DogController {
	
	@Autowired
	private DogService dogService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Dog> getDogs() {
		return dogService.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Dog createDog(@RequestBody Dog dog) {
		return dogService.save(dog);
	}

}
