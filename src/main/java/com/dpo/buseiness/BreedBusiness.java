package com.dpo.buseiness;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpo.service.BreedService;
import com.dpo.service.CowService;

@Service
public class BreedBusiness {
    @Autowired
	BreedService breedService;

    public List<String> getListBreedCode(){
        List<String> breedCodeList = breedService.getListBreedCode();
        return breedCodeList;
    }
}
