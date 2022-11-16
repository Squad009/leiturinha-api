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

import com.recode.api.domain.Material;
import com.recode.api.services.MaterialService;

@RestController
@RequestMapping("materiais")
public class MaterialController {

	@Autowired
	private MaterialService service;
	
	@GetMapping
	public ResponseEntity<List<Material>> getAll() {
		List<Material> materiais = service.getAll();
		return ResponseEntity.ok().body(materiais);
	}
	
	@PostMapping
	public ResponseEntity<Material> save(@RequestBody Material material) {
		material.setDataCriacao(Calendar.getInstance().getTime());
		Material savedMaterial = service.save(material);
		return ResponseEntity.ok().body(savedMaterial);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Material> update(@PathVariable("id") Integer id, @RequestBody Material material) {
		Material updatedMaterial = service.update(id, material);
		return ResponseEntity.ok().body(updatedMaterial);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("material")
	public ResponseEntity<Material> findById(@RequestParam("id") Integer id) {
		Material material = service.findById(id);
		return ResponseEntity.ok().body(material);
	}
}
