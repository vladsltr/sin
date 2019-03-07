package com.sincrono.gestionale.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cespite")
public class Cespite {
	
	private int id_cespite;
	private String descrizione;
	private String stato;
	private String tipologia;
	
	
	public Cespite() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cespite")
	public int getId_cespite() {
		return id_cespite;
	}

	public void setId_cespite(int id_cespite) {
		this.id_cespite = id_cespite;
	}
	
	@Column(name="descrizione")
	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	@Column(name="stato")
	public String getStato() {
		return stato;
	}
	
	public void setStato(String stato) {
		this.stato = stato;
	}

	@Column(name="tipologia")
	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}
	

	
	
}
