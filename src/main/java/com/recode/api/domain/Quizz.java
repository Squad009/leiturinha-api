package com.recode.api.domain;


import java.util.Calendar;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Quizz {
 

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String enunciado;
	
	@Column(name = "data_criacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	
	@Column(name = "opcao_a")
	private String opcaoA;
	
	@Column(name = "opcao_b")
	private String opcaoB;
	
	@Column(name = "opcao_c")
	private String opcaoC;
	
	@Column(name = "opcao_d")
	private String opcaoD;
	
	@Column(name = "opcao_e")
	private String opcaoE;
	
	@Column(name = "opcao_correta")
	private String opcaoCorreta;
	
	

	
	public Quizz() {
		
	}

	public Quizz(String enunciado, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE,
			String opcaoCorreta) {
		
		this.dataCriacao = Calendar.getInstance().getTime();
		this.enunciado = enunciado;
		this.opcaoA = opcaoA.toUpperCase();
		this.opcaoC = opcaoC.toUpperCase();
		this.opcaoB = opcaoB.toUpperCase();
		this.opcaoD = opcaoD.toUpperCase();
		this.opcaoE = opcaoE.toUpperCase();
		this.opcaoCorreta = opcaoCorreta.toUpperCase();
		
	}

	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getOpcaoA() {
		return opcaoA;
	}

	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}

	public String getOpcaoB() {
		return opcaoB;
	}

	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}

	public String getOpcaoC() {
		return opcaoC;
	}

	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}

	public String getOpcaoD() {
		return opcaoD;
	}

	public void setOpcaoD(String opcaoD) {
		this.opcaoD = opcaoD;
	}

	public String getOpcaoE() {
		return opcaoE;
	}

	public void setOpcaoE(String opcaoE) {
		this.opcaoE = opcaoE;
	}

	public String getOpcaoCorreta() {
		return opcaoCorreta;
	}

	public void setOpcaoCorreta(String opcaoCorreta) {
		this.opcaoCorreta = opcaoCorreta;
	}

	@Override
	public String toString() {
		return "{ id: " + this.id +
				"/ enunciado: " + this.enunciado +
				"/ opcao correta: " + this.opcaoCorreta +
				" }";
	}
}
