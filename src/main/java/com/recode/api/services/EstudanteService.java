package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.Estudante;
import com.recode.api.repositories.EstudanteRepository;

@Service
public class EstudanteService {
	
	@Autowired
	private EstudanteRepository repository;
	
	public List<Estudante> getAll(){
		return repository.findAll();
	}
	
	public Estudante save (Estudante estudante) {
		return repository.save(estudante);
	}
	
	public Estudante findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public Estudante update (Integer id, Estudante newEstudante) {
		Estudante estudante = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		estudante.setNome(newEstudante.getNome());
		estudante.setEmail(newEstudante.getEmail());
		estudante.setDataNascimento(newEstudante.getDataNascimento());
		estudante.setSenha(newEstudante.getSenha());
		return repository.save(estudante);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}

}
