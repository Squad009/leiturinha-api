package com.recode.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recode.api.domain.ComentarioConto;
import com.recode.api.repositories.ComentarioContoRepository;

@Service
public class ComentarioService {
	

	@Autowired
	private ComentarioContoRepository repository;
	
	public List<ComentarioConto> getAllDesc() {
		return repository.findByOrderByDataHoraMensagemDesc();
	}
	
	public ComentarioConto save(ComentarioConto comentario) {
		return repository.save(comentario);
	}
	
	public ComentarioConto findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public ComentarioConto update(Integer id, ComentarioConto newComentario) {
		ComentarioConto comentario = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		comentario.setAutor(newComentario.getAutor());
		comentario.setMensagem(newComentario.getMensagem());
		comentario.setConto_id(newComentario.getConto_id());
		comentario.setDataHoraMensagem(newComentario.getDataHoraMensagem());
		return repository.save(comentario);
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}


}
