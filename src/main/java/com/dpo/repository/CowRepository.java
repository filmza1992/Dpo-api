package com.dpo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dpo.model.TbdCow;

public interface CowRepository extends JpaRepository<TbdCow,Long>{
    TbdCow findByCowId(long id);

    List<TbdCow> findTop20000By();
}
