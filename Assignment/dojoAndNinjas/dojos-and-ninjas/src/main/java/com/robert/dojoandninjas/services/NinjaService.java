package com.robert.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.dojoandninjas.models.Ninja;
import com.robert.dojoandninjas.repository.NinjaRepository;

@Service
public class NinjaService {
	public final NinjaRepository ninjaRepo;
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	// find all
	public List<Ninja> findAll(){
		return ninjaRepo.findAll();
	}
	
	
	// get one by id
	
	public Ninja getNinja(Long id) {
		Optional<Ninja> potentialNinja = ninjaRepo.findById(id);
		return potentialNinja.isPresent()? potentialNinja.get() : null;
	}
		
	
	// create
	
	public Ninja create(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
}
