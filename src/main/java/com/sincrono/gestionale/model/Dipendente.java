package com.sincrono.gestionale.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dipendente")
public class Dipendente {
	private int id_dipendente;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private Date dataInizio;
	private Date dataFine;
	private float stipendio;
	private String ruolo;
	private boolean stato;
	private int idCv;
	
	public Dipendente() {
		
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_dipendente")
	public int getId_dipendente() {
		return id_dipendente;
	}

	public void setId_dipendente(int id_dipendente) {
		this.id_dipendente = id_dipendente;
	}

	@Column(name="nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Column(name="cognome")
	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="dataInizio")
	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}
	
	@Column(name="dataFine")
	public Date getDataFine() {
		return dataFine;
	}

	public void setDataFine(Date dataFine) {
		this.dataFine = dataFine;
	}
	
	@Column(name="stipendio")
	public float getStipendio() {
		return stipendio;
	}

	public void setStipendio(float stipendio) {
		this.stipendio = stipendio;
	}
	
	@Column(name="ruolo")
	public String getRuolo() {
		return ruolo;
	}

	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	
	@Column(name="stato")
	public boolean isStato() {
		return stato;
	}

	public void setStato(boolean stato) {
		this.stato = stato;
	}

	@Column(name="idCv")
	public int getIdCv() {
		return idCv;
	}

	public void setIdCv(int idCv) {
		this.idCv = idCv;
	}
	
	

	
}
