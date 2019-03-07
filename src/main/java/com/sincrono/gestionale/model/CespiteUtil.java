package com.sincrono.gestionale.model;

import org.springframework.beans.factory.annotation.Autowired;

public class CespiteUtil {
	
	@Autowired
	CespiteService cs;
	
	public CespiteService getService() {
		return cs;
	}
	
	public boolean inserisci(Cespite c) {
		return cs.save(c)!=null? true: false;
	}
	public boolean edit(Cespite c) {
		return true;
	}
	public boolean editAssegnazione(Cespite c) {
		return true;
	}
	
}	
