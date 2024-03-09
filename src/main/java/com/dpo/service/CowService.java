package com.dpo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpo.model.TbdCow;
import com.dpo.repository.CowRepository;


@Service
public class CowService {
    @Autowired
	CowRepository CowRepository;
    
    public List<TbdCow> getListCow(){
        return CowRepository.findTop20000By();
    }
    
    public TbdCow getCow(long id){
        return CowRepository.findByCowId(id);
    }
}
