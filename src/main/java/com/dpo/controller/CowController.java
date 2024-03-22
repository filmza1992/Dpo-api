package com.dpo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dpo.buseiness.CowBusiness;
import com.dpo.json.DpoDairyNewFormat;
@Controller
@RequestMapping("/cow")
public class CowController {
	
	@Autowired
	CowBusiness cowBusiness;

	
	@GetMapping("/all_list")
	public ResponseEntity<List<DpoDairyNewFormat>> getListCow() {
		return ResponseEntity.ok(cowBusiness.getListCow());
	}

	@GetMapping("/top_10000")
	public ResponseEntity<List<DpoDairyNewFormat>> getListCowByTop() {
		return ResponseEntity.ok(cowBusiness.getListCowTopBy());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<DpoDairyNewFormat> getCow(@PathVariable long id){
		return ResponseEntity.ok(cowBusiness.getCowById(id));
	}
}