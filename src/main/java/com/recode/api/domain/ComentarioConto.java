package com.recode.api.domain;

import java.io.Serializable;
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

public class ComentarioConto implements Serializable{

	 
	private static final long serialVersionUID = 1L;

		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
	
		@Column
		private int conto_id;
		
		@Column
		private String autor;
		
		@Column
		private String mensagem;
		
		@Column(name = "data_hora_msg")
		@Temporal(TemporalType.TIMESTAMP)
		private Date dataHoraMensagem;
		
		public ComentarioConto () {
			
		}
		

		public ComentarioConto(String autor, String mensagem, Integer conto_id) {
			
			this.autor = autor;
			this.mensagem = mensagem;
			this.conto_id = conto_id;
			this.dataHoraMensagem = Calendar.getInstance().getTime();
		}
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		
		

		public int getConto_id() {
			return conto_id;
		}


		public void setConto_id(int conto_id) {
			this.conto_id = conto_id;
		}


		public static long getSerialversionuid() {
			return serialVersionUID;
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

		public void setMensagem(String menssagem) {
			this.mensagem = menssagem;
		}


		public Date getDataHoraMensagem() {
			return dataHoraMensagem;
		}


		public void setDataHoraMensagem(Date dataHoraMensagem) {
			this.dataHoraMensagem = dataHoraMensagem;
		}

		
}
