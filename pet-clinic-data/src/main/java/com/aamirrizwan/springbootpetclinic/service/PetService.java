package com.aamirrizwan.springbootpetclinic.service;

import java.util.Set;

import com.aamirrizwan.springbootpetclinic.model.Pet;

public interface PetService {
	
	Pet findByLastName(String lastName);
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
