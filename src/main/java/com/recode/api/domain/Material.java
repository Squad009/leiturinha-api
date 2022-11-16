package com.recode.api.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Material implements Serializable {
	
	private static final long serialVersionUID = 1526892753147290737L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String titulo;
	
	private String conteudo;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date dataCriacao;
	
	@Lob
	@Column(name = "imagem_conteudo")
	private byte[] imagemConteudo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public byte[] getImagemConteudo() {
		return imagemConteudo;
	}

	public void setImagemConteudo(byte[] imagemConteudo) {
		this.imagemConteudo = imagemConteudo;
	}
	
	

}
