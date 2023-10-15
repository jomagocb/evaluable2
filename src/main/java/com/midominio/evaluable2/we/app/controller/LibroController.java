package com.midominio.evaluable2.we.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable2.we.app.model.dao.LibroRepository;

@Controller
@RequestMapping("/catalogo")
public class LibroController {

	@Autowired
	LibroRepository libroRepository;
	
	@ModelAttribute("tituloNavegador")
	private String tituloNavegador() {return "Biblioteca";}
	
	@GetMapping("/completo")
	public String listaCompleta(Model model) {
		model.addAttribute("listadoCompleto", libroRepository.findAll());
		
		return "/libro/catalogo-completo";
	}
	
}
