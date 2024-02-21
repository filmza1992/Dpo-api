package com.dpo.buseiness;

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

    public List<DpoDairyNewFormat> getListCow() {
        
        List<TbdCow> cowList = cowService.getListCow();
        
        return DpoDairyNewFormat.packJsons(cowList);
    }

    public DpoDairyNewFormat getCowById(long id){
        TbdCow cow = cowService.getCow(id);
        return DpoDairyNewFormat.packJson(cow);
    }
}
