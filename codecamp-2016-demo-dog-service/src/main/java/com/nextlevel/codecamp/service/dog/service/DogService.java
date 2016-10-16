package com.nextlevel.codecamp.service.dog.service;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nextlevel.codecamp.model.dog.Dog;
import com.nextlevel.codecamp.service.dog.repository.DogRepository;

@Service
public class DogService {
	
	@Autowired
	private DogRepository dogRepository;
	
	public List<Dog> findAll() {
		return IterableUtils.toList(dogRepository.findAll());
	}
	
	@Transactional
	public Dog save(Dog dog) {
		return dogRepository.save(dog);
	}

}
