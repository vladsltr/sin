package com.sincrono.gestionale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ruolo")
public class Ruolo {
	private int id_ruolo;
	private String titolo;
	
	public Ruolo() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_ruolo")
	public int getId_ruolo() {
		return id_ruolo;
	}

	public void setId_ruolo(int id) {
		this.id_ruolo = id;
	}
	@Column(name="titolo")
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	
	
	
}
