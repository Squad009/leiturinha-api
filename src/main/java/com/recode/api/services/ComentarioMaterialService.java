package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.ComentarioMaterial;
import com.recode.api.repositories.ComentarioMaterialRepository;


@Service
public class ComentarioMaterialService {

	@Autowired
	private ComentarioMaterialRepository repository;
	
	public List<ComentarioMaterial> getAll() {
		return repository.findAll();
	}
	
	public List<ComentarioMaterial> getAllDesc() {
		return repository.findByOrderByDataHoraMensagemDesc();
	}
	
	public ComentarioMaterial save(ComentarioMaterial comentarioMaterial) {
		return repository.save(comentarioMaterial);
	}
	 
}
