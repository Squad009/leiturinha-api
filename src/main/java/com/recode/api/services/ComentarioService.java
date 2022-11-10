package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.Comentario;
import com.recode.api.repositories.ComentarioRepository;

@Service
public class ComentarioService {
	

	@Autowired
	private ComentarioRepository repository;
	
	public List<Comentario> getAll() {
		return repository.findAll();
	}
	
	public Comentario save(Comentario comentario) {
		return repository.save(comentario);
	}
	
	public Comentario findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public Comentario update(Integer id, Comentario newComentario) {
		Comentario comentario = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		comentario.setAutor(newComentario.getAutor());
		comentario.setMenssagem(newComentario.getMenssagem());
		comentario.setConto_id(newComentario.getConto_id());
		comentario.setDataHoraMensagem(newComentario.getDataHoraMensagem());
		return repository.save(comentario);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}


}