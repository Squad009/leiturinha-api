package com.recode.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.Categoria;
import com.recode.api.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria save(Categoria categoria) {
		return repository.save(categoria);
	}
}
