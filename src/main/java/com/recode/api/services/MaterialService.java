package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.Material;
import com.recode.api.repositories.MaterialRepository;


@Service
public class MaterialService {
	
	@Autowired
	private MaterialRepository repository;
	
	public List<Material> getAll() {
		return repository.findAll();
	}
	
	public Material save(Material material) {
		return repository.save(material);
	}
	
	public Material findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public Material update(Integer id, Material newMaterial) {
		Material material = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		material.setTitulo(newMaterial.getTitulo());
		material.setConteudo(newMaterial.getConteudo());
		material.setImagemConteudo(newMaterial.getImagemConteudo());
		return repository.save(material);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}

}
