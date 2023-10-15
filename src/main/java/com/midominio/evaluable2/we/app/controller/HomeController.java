package com.midominio.evaluable2.we.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/biblioteca")
public class HomeController {

	@ModelAttribute("tituloNavegador")
	private String tituloNavegador() {return "Biblioteca";}
	
	@GetMapping("/inicio")
	public String paginaInicio(Model model) {
		model.addAttribute("titulo", "Biblioteca Municipal");
		
		return "/home/pagina-inicio";
	}
}
