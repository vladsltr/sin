package com.sincrono.gestionale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="struttura")
public class Struttura {
	
	private int id;
	private String descrizione;
	
	public Struttura() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_dipendente")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Column(name="descrizione")
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	
	
}
