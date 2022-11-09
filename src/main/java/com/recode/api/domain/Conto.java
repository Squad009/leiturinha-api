package com.recode.api.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


@Entity
public class Conto implements Serializable{
	
	private static final long serialVersionUID = -8899106119440634094L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	
	@Column(name = "avalia_soma")
	private Double avaliaSoma;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Lob
	private String conteudo;
	
	@ManyToOne
	private Categoria categoria;
	
	@Lob
	@Column(name = "imagem_capa")
	private byte[] imagemCapa;
	
	@Column(name = "total_avaliadores")
	private Long totalAvaliadores;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getAvaliaSoma() {
		return avaliaSoma;
	}

	public void setAvaliaSoma(Double avaliaSoma) {
		this.avaliaSoma = avaliaSoma;
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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public byte[] getImagemCapa() {
		return imagemCapa;
	}

	public void setImagemCapa(byte[] imagemCapa) {
		this.imagemCapa = imagemCapa;
	}

	public Long getTotalAvaliadores() {
		return totalAvaliadores;
	}

	public void setTotalAvaliadores(Long totalAvaliadores) {
		this.totalAvaliadores = totalAvaliadores;
	}
	
	
	

}
