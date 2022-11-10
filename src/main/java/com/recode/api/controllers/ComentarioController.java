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

import com.recode.api.domain.Comentario;
import com.recode.api.services.ComentarioService;

@RestController
@RequestMapping("comentarios")
public class ComentarioController {
	
	@Autowired
	private ComentarioService service;
	
	@GetMapping
	public ResponseEntity<List<Comentario>> getAll() {
		List<Comentario> comentario = service.getAll();
		return ResponseEntity.ok().body(comentario);
	}
	
	@PostMapping
	public ResponseEntity<Comentario> save(@RequestBody Comentario comentario) {
		Comentario savedComentario = service.save(comentario);
		return ResponseEntity.ok().body(savedComentario);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Comentario> update(@PathVariable("id") Integer id, @RequestBody Comentario comentario) {
		Comentario updatedComentario = service.update(id, comentario);
		return ResponseEntity.ok().body(updatedComentario);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Comentario> findById(@RequestParam("id") Integer id) {
		Comentario comentario = service.findById(id);
		return ResponseEntity.ok().body(comentario);
	}

}
