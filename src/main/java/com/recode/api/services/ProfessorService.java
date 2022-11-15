package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.Professor;
import com.recode.api.repositories.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository repository;
	
	public List<Professor> getAll(){
		return repository.findAll();
	}
	
	public Professor save (Professor professor) {
		return repository.save(professor);
	}
	
	public Professor findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public Professor update (Integer id, Professor newProfessor) {
		Professor professor = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		professor.setNome(newProfessor.getNome());
		professor.setEmail(newProfessor.getEmail());
		professor.setInstituicaoEnsino(newProfessor.getInstituicaoEnsino());
		professor.setSenha(newProfessor.getSenha());
		return repository.save(professor);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}
	
	
	
}
