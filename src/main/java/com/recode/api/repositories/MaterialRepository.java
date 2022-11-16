package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.api.domain.Material;

public interface MaterialRepository extends JpaRepository<Material, Integer> {

}
