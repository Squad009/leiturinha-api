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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.recode.api.domain.Categoria;
import com.recode.api.domain.Conto;
import com.recode.api.services.ContoService;

@RestController
@RequestMapping("contos")
public class ContoController {
	
	@Autowired
	private ContoService service;
	
	@GetMapping("cat")
	public ResponseEntity<List<Conto>> findByCategoria(@RequestParam("id_categoria") Integer id) {
		List<Conto> contos = service.findByCategoria(id);
		return ResponseEntity.ok().body(contos);
	}
	
	@GetMapping
	public ResponseEntity<List<Conto>> getAll() {
		List<Conto> contos = service.getAll();
		return ResponseEntity.ok().body(contos);
	}
	
	@PostMapping
	public ResponseEntity<Conto> save(@RequestBody Conto conto) {
		Conto savedConto = service.save(conto);
		return ResponseEntity.ok().body(savedConto);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Conto> update(@PathVariable("id") Integer id, @RequestBody Conto conto) {
		Conto updatedConto = service.update(id, conto);
		return ResponseEntity.ok().body(updatedConto);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("conto")
	public ResponseEntity<Conto> findById(@RequestParam("id") Integer id) {
		Conto conto = service.findById(id);
		return ResponseEntity.ok().body(conto);
	}

}
