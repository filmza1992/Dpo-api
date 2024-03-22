package com.dpo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpo.model.TbdCow;
import com.dpo.repository.Breedepository;


@Service
public class BreedService {
   @Autowired
	Breedepository breedRepository;
    
    public List<String> getListBreedCode(){
        return breedRepository.getAllDairyBreedPatternOnly();
    } 
}
