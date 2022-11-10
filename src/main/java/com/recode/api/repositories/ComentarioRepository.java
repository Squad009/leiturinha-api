package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.api.domain.Comentario;


public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

}
