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

import com.recode.api.domain.Quizz;
import com.recode.api.services.QuizzService;

@RestController
@RequestMapping("quizzes")
public class QuizzController {
  
	
	@Autowired
	private QuizzService service;
		
	@GetMapping
	public ResponseEntity<List<Quizz>> getAll() {
		List<Quizz> quizz = service.getAll();
		return ResponseEntity.ok().body(quizz);
	}
	
	@PostMapping
	public ResponseEntity<Quizz> save(@RequestBody Quizz quizz) {
		Quizz savedQuizz = service.save(quizz);
		return ResponseEntity.ok().body(savedQuizz);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Quizz> update(@PathVariable("id") Integer id, @RequestBody Quizz quizz) {
		Quizz updatedQuizz = service.update(id, quizz);
		return ResponseEntity.ok().body(updatedQuizz);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
		service.remove(id);
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("quizzes")
	public ResponseEntity<Quizz> findById(@RequestParam("id") Integer id) {
		System.out.print("ID " + id);
		Quizz quizz = service.findById(id);
		return ResponseEntity.ok().body(quizz);
	}
		
			
		}
