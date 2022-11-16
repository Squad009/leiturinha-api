package com.recode.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.api.domain.Categoria;
import com.recode.api.services.CategoriaService;

@RestController
@RequestMapping("categoria")
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@PostMapping
	public ResponseEntity<Categoria> save(@RequestBody Categoria categoria) {
		Categoria value = service.save(categoria);
		return ResponseEntity.ok().body(value);
	}
}
