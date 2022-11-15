package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recode.api.domain.Quizz;


@Repository
public interface QuizzRepository extends JpaRepository<Quizz, Integer> {

}
