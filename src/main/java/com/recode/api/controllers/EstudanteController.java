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

import com.recode.api.domain.Estudante;
import com.recode.api.services.EstudanteService;

@RestController
@RequestMapping("estudante")
public class EstudanteController {
	
	@Autowired
	private EstudanteService service;
	
	@GetMapping
	public ResponseEntity <List<Estudante>> getAll(){
		List<Estudante> estudantes = service.getAll();
		return ResponseEntity.ok().body(estudantes);
	}
	
	@PostMapping
	public ResponseEntity<Estudante> save(@RequestBody Estudante estudante){
		Estudante savedEstudante = service.save(estudante);
		return ResponseEntity.ok().body(savedEstudante);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Estudante> update(@PathVariable("id") Integer id,@RequestBody Estudante estudante ){
		Estudante updatedEstudante = service.update(id, estudante);
		return ResponseEntity.ok().body(updatedEstudante);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	

}
