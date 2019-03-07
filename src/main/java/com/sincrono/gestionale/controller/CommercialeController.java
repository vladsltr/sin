package com.sincrono.gestionale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sincrono.gestionale.model.Cespite;
import com.sincrono.gestionale.model.CespiteService;
import com.sincrono.gestionale.model.CespiteUtil;

@Controller
@RequestMapping(path="/")
public class CommercialeController {
	
	@Autowired
	CespiteService cs=new CespiteUtil().getService();
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Cespite> getAllUsers() {
		// This returns a JSON or XML with the users	
		return cs.findAll();
	}
	
}
