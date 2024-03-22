package com.dpo.buseiness;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dpo.json.DpoDairyNewFormat;
import com.dpo.model.TbdCow;
import com.dpo.service.CowService;

@Service
public class CowBusiness {
    @Autowired
	CowService cowService;

    int count = 0;
    public List<DpoDairyNewFormat> getListCow() {
        List<TbdCow> cowList = cowService.getListCow();
        
        return DpoDairyNewFormat.packJsons(cowList);
    }
    public List<DpoDairyNewFormat> getListCowTopBy(){
        List<TbdCow> cowList = cowService.getListCowTopBy();
        
        
        return DpoDairyNewFormat.packJsons(cowList);
    }
    // public List<DpoDairyNewFormat> getListCow() {
    //     List<TbdCow> cowList = new ArrayList<>();
    //     for(int i = 0 ; i < 951 ; i++){ 
    //         TbdCow cow = cowService.getCow(i+1);
    //         System.out.println(cow.getCowId());
           
    //         cowList.add(cow);
    //     }
        
    //     return DpoDairyNewFormat.packJsons(cowList);
    // }

    public DpoDairyNewFormat getCowById(long id){
        TbdCow cow = cowService.getCow(id);
        return DpoDairyNewFormat.packJson(cow);
    }
}
