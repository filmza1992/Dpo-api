package com.dpo.json;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import com.dpo.model.TbdBreed;
import com.dpo.model.TbdCow;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
// SELECT cow_id , cow_name , cow_fa_zyan_code,cow_ma_zyan_code,tbd_cow.farm_id
// ,breed_code, breed_name, breed_id_string 
// FROM tbd_breed , tbd_cow
// WHERE tbd_breed.breed_id = tbd_cow.breed_id
@Setter
@Getter
@RequiredArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DpoDairyNewFormat {
	private long cowId;
	private String cowName;
	private String cowFaZyanCode;
	private String cowMaZyanCode;
	private long farmId;
	private long breedId;
	private String breedCode;
	private String breedName;
	private String breedIdString;
	
	
	public static DpoDairyNewFormat packJson(TbdCow cow) {
		DpoDairyNewFormat json = new DpoDairyNewFormat();
		json.setCowId(cow.getCowId());
		json.setCowName(cow.getCowName());
		json.setCowFaZyanCode(cow.getCowFaZyanCode());
		json.setCowMaZyanCode(cow.getCowMaZyanCode());
		json.setFarmId(cow.getTbdFarm().getFarmId());
		json.setBreedId(cow.getTbdBreed().getBreedId());
		json.setBreedCode(cow.getTbdBreed().getBreedCode());
		json.setBreedName(cow.getTbdBreed().getBreedName());
		json.setBreedIdString(cow.getTbdBreed().getBreedIdString());
		return json;
	}
	
	public static List<DpoDairyNewFormat> packJsons(List<TbdCow> cows) {
		List<DpoDairyNewFormat> jsons = new ArrayList<>();
		for (TbdCow cow : cows) {
			jsons.add(DpoDairyNewFormat.packJson(cow));
		}
		return jsons;
	}
}
