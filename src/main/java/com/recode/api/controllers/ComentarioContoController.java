package com.recode.api.controllers;

import java.util.Calendar;
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

import com.recode.api.domain.ComentarioConto;
import com.recode.api.services.ComentarioService;

@RestController
@RequestMapping("comentario_conto")
public class ComentarioContoController {
	
	@Autowired
	private ComentarioService service;
	
	@GetMapping
	public ResponseEntity<List<ComentarioConto>> getAllDesc() {
		List<ComentarioConto> comentarios = service.getAllDesc();
		return ResponseEntity.ok().body(comentarios);
	}
	
	@PostMapping
	public ResponseEntity<ComentarioConto> save(@RequestBody ComentarioConto comentario) {
		comentario.setDataHoraMensagem(Calendar.getInstance().getTime());
		ComentarioConto savedComentario = service.save(comentario);
		return ResponseEntity.ok().body(savedComentario);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ComentarioConto> update(@PathVariable("id") Integer id, @RequestBody ComentarioConto comentario) {
		ComentarioConto updatedComentario = service.update(id, comentario);
		return ResponseEntity.ok().body(updatedComentario);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<ComentarioConto> findById(@RequestParam("id") Integer id) {
		ComentarioConto comentario = service.findById(id);
		return ResponseEntity.ok().body(comentario);
	}

}
