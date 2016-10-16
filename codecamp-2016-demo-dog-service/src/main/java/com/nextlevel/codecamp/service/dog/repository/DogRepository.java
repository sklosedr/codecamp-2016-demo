package com.nextlevel.codecamp.service.dog.repository;

import org.springframework.data.repository.CrudRepository;

import com.nextlevel.codecamp.model.dog.Dog;

public interface DogRepository extends CrudRepository<Dog, Long> {

}
