package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.api.domain.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {

}
