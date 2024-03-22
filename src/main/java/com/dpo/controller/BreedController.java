package com.dpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpo.buseiness.BreedBusiness;
import com.dpo.json.DpoDairyNewFormat;

@Controller
@RequestMapping("/breed")
public class BreedController {
    
    @Autowired
    BreedBusiness breedBusiness;

    @GetMapping("/breed_code")
	public ResponseEntity<List<String>> getListBreedCode() {
		return ResponseEntity.ok(breedBusiness.getListBreedCode());
	}
}
