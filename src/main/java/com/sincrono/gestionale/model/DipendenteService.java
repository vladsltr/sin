package com.sincrono.gestionale.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DipendenteService extends JpaRepository<Dipendente, Integer> {
	/*public boolean inserisci(Dipendente d);
	public boolean elimina(int d);
	public boolean edit(int d);
	public boolean disattiva(int id);
	public boolean attiva(int id);
	public boolean resetPswd(int id,String psw);
	public boolean uploadCv();*/
}
