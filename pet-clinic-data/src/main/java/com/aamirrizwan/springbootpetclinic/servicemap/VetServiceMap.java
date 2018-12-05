package com.aamirrizwan.springbootpetclinic.servicemap;

import java.util.Set;

import com.aamirrizwan.springbootpetclinic.model.Owner;
import com.aamirrizwan.springbootpetclinic.model.Vet;
import com.aamirrizwan.springbootpetclinic.service.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Vet save(Vet object) {
		return super.save(object.getId(), object);
	}

	@Override
	public	Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Long id, Vet object) {
		return super.save(id, object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public	void delete(Vet object) {
		super.delete(object);
	}


}
