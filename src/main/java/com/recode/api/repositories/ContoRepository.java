package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.api.domain.Conto;

public interface ContoRepository extends JpaRepository<Conto, Integer> {

}
