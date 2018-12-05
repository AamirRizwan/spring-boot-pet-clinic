package com.aamirrizwan.springbootpetclinic.service;

import java.util.Set;

import com.aamirrizwan.springbootpetclinic.model.Vet;

public interface VetService {
	
	Vet findById(Long id);
	
	Vet save(Vet owner);
	
	Set<Vet> findAll();

}
