package com.sincrono.gestionale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class SincronizeApplication {
	
	@RequestMapping("/")
	public String getIndex(Model m) {
		
		return "index";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SincronizeApplication.class, args);
	}

}
