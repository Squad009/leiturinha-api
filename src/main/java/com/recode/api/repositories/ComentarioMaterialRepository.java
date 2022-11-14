package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recode.api.domain.ComentarioMaterial;

@Repository
public interface ComentarioMaterialRepository extends JpaRepository<ComentarioMaterial, Integer>{

}
