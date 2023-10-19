package com.midominio.evaluable2.we.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.midominio.evaluable2.we.app.model.entity.Libro;
import com.midominio.evaluable2.we.app.service.LibroService;

@Controller
@RequestMapping("/catalogo")
public class LibroController {

	@Autowired
	LibroService libroService;
	
	@ModelAttribute("tituloNavegador")
	private String tituloNavegador() {return "Biblioteca";}
	
	@GetMapping("/completo")
	public String listaCompleta(Model model) {
		model.addAttribute("listadoCompleto", libroService.findAll());
		return "/libro/catalogo-completo";
	}
	@GetMapping("/completo/un-libro-mas/{id}")
	public String sumaUnStock(@PathVariable Long id) {
		libroService.sumaUnLibro(id);

		return "redirect:/catalogo/completo";
	}
	
	/*@GetMapping("/info")
	public String infoLibro(@RequestParam(required = false) Long id,Model model) {
		model.addAttribute("titulo", "Información detallada del libro");
	
		
		titulo
		nombre del libro
		información detallada
		botones alta baja
		
		
		return "/libro/info-libro";*/
	
}
