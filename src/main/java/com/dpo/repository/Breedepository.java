package com.dpo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dpo.model.TbdBreed;

public interface Breedepository extends JpaRepository<TbdBreed,Long>{
    
    @Query(value = "SELECT breed_code FROM tbd_breed GROUP BY breed_code", nativeQuery = true)
    List<String> getAllDairyBreedPatternOnly();
}