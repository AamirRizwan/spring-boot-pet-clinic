package com.aamirrizwan.springbootpetclinic.service;

import java.util.Set;

import com.aamirrizwan.springbootpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();

}
