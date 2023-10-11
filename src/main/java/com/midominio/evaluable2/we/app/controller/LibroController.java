package com.midominio.evaluable2.we.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LibroController {

	@GetMapping("/catalogo/completo")
	public String listaCompleta() {
		
		return "/libro/catalogo-completo";
	}
	
}
