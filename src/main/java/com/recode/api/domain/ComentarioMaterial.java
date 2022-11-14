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
public class ComentarioMaterial {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Integer id;
	
	@Column
	private String autor;
	
	@Column
	private String mensagem;
	
	@Column (name = "data_hora_msg")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataHoraMensagem;
	
	
	public ComentarioMaterial() {
		
	}
	

	public ComentarioMaterial(String autor, String mensagem) {
		this.autor = autor;
		this.mensagem = mensagem;
		this.dataHoraMensagem = Calendar.getInstance().getTime();
	}
	
	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataHoraMensagem() {
		return dataHoraMensagem;
	}

	public void setDataHoraMensagem(Date dataHoraMensagem) {
		this.dataHoraMensagem = dataHoraMensagem;
	}
	

	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
		
	}
	
	public String getMensagem() {
		return mensagem;
	}	

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
		
	}
	

	@Override
	public String toString() {
		return "{autor= " + this.autor + ", mensagem =" + this.mensagem +",data do comentario = "+ this.dataHoraMensagem + "}";
	}


}
