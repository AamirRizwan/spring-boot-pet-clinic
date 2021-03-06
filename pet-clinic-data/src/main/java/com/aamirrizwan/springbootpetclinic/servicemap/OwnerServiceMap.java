package com.aamirrizwan.springbootpetclinic.servicemap;

import java.util.Set;

import com.aamirrizwan.springbootpetclinic.model.Owner;
import com.aamirrizwan.springbootpetclinic.service.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public	Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Long id, Owner object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public	void delete(Owner object) {
		super.delete(object);
	}

}
