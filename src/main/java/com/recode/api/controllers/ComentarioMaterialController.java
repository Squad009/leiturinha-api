package com.recode.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.recode.api.domain.ComentarioMaterial;
import com.recode.api.services.ComentarioMaterialService;

@RestController
@RequestMapping("comentario_material")
public class ComentarioMaterialController {

	@Autowired
	private ComentarioMaterialService service;
	
	@PostMapping
	public ResponseEntity<ComentarioMaterial> save(@RequestBody ComentarioMaterial comentarioMaterial) {
		ComentarioMaterial comentario = service.save(comentarioMaterial);
		
		return ResponseEntity.ok().body(comentario);	
	}
	
	@GetMapping
	public ResponseEntity<List<ComentarioMaterial>> getAll() {
		List<ComentarioMaterial> comentarios = service.getAll();
		
		return ResponseEntity.ok().body(comentarios);
	}
}
