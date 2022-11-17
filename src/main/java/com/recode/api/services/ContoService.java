package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.Categoria;
import com.recode.api.domain.Conto;
import com.recode.api.repositories.ContoRepository;

@Service
public class ContoService {
	
	@Autowired
	private ContoRepository repository;
	
	public List<Conto> getAll() {
		return repository.findAll();
	}
	
	public Conto save(Conto conto) {
		return repository.save(conto);
	}
	
	public Conto findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public Conto update(Integer id, Conto newConto) {
		Conto conto = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		conto.setCategoria(newConto.getCategoria());
		conto.setTitulo(newConto.getTitulo());
		conto.setConteudo(newConto.getConteudo());
		conto.setImagemCapa(newConto.getImagemCapa());
		return repository.save(conto);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}
	
	public List<Conto> findByCategoria(Integer id) {
		return repository.retrieveByCategoria(id);
	}

}
