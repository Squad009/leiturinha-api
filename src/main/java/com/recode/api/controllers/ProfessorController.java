package com.recode.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.api.domain.Professor;
import com.recode.api.services.ProfessorService;

@RestController
@RequestMapping("professor")
public class ProfessorController {

	@Autowired
	private ProfessorService service;
	
	@GetMapping
	public ResponseEntity <List<Professor>> getAll(){
		List<Professor> professores = service.getAll();
		return ResponseEntity.ok().body(professores);
	}
	
	@PostMapping
	public ResponseEntity<Professor> save(@RequestBody Professor professor){
		Professor savedProfessor = service.save(professor);
		return ResponseEntity.ok().body(savedProfessor);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Professor> update(@PathVariable("id") Integer id,@RequestBody Professor professor ){
		Professor updatedProfessor = service.update(id, professor);
		return ResponseEntity.ok().body(updatedProfessor);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
}
