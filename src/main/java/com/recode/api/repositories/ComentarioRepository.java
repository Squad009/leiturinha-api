package com.recode.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.recode.api.domain.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

}
