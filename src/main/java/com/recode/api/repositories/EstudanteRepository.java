package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.api.domain.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Integer> {

}
