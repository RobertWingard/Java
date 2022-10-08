package com.robert.dojoandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.robert.dojoandninjas.models.Dojo;
import com.robert.dojoandninjas.repository.DojoRepository;

@Service
public class DojoService {
	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
    }
    // creates a whatever
    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }
    // retrieves one whatever
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        } else {
            return null;
        }
    }
    
    // updates a whatever
    public Dojo updateDojo(Dojo dojo) {
    	return dojoRepository.save(dojo);
    }
    // Deletes one by id
    public void deleteDojo(Long id) {
    	dojoRepository.deleteById(id);
    }
}