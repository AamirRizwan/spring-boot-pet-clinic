package com.aamirrizwan.springbootpetclinic.service;

import com.aamirrizwan.springbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	
	Owner findByLastName(String lastName);

}
