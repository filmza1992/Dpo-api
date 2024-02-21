package com.dpo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpo.model.TbdCow;

public interface CowRepository extends JpaRepository<TbdCow,Long>{
    TbdCow findByCowId(long id);
}
