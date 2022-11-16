package com.recode.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recode.api.domain.ComentarioConto;

public interface ComentarioContoRepository extends JpaRepository<ComentarioConto, Integer> {
	
	List<ComentarioConto> findByOrderByDataHoraMensagemDesc();
}
