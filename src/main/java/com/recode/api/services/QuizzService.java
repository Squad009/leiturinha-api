package com.recode.api.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.recode.api.domain.Quizz;
import com.recode.api.repositories.QuizzRepository;


@Service
public class QuizzService {
 
	@Autowired
	private QuizzRepository repository;
	
	public List<Quizz> getAll() {
		return repository.findAll();
	}
	
	public Quizz save(Quizz quizz) {
		return repository.save(quizz);
	}
	
	public Quizz findById(Integer id) {
		return repository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
	}
	
	public Quizz update(Integer id, Quizz newQuizz) {
		Quizz quizz = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id: " + id));
		quizz.setEnunciado(newQuizz.getEnunciado());
		quizz.setDataCriacao(newQuizz.getDataCriacao());
		quizz.setOpcaoA(newQuizz.getOpcaoA());
		quizz.setOpcaoB(newQuizz.getOpcaoB());
		quizz.setOpcaoC(newQuizz.getOpcaoC());
		quizz.setOpcaoD(newQuizz.getOpcaoD());
		quizz.setOpcaoE(newQuizz.getOpcaoE());
		quizz.setOpcaoCorreta(newQuizz.getOpcaoCorreta());
		return repository.save(quizz);
		
	}
	
	public void remove(Integer id) {
		repository.deleteById(id);
	}


}
