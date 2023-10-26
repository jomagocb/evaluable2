package com.midominio.evaluable2.we.app.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.midominio.demos.coches.model.Coche;
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
	@GetMapping("/completo/borrar/{id}")
	public String borrarLibro(@PathVariable Long id) {
		libroService.borrarLibro(id);
		return "redirect:/catalogo/completo";
	}
	@GetMapping("/libro/form")
	public String formularioVacio(Model model) {
		model.addAttribute("libro", new Libro());
		model.addAttribute("cabecera", "Nuevo libro:");
		return "/libro/form";
	}
	
	@PostMapping("/libro/form")
	public String guardaUnLibro(Libro libro) {
		libroService.save(libro);
		return "redirect:/catalogo/completo";
	}
	
	@GetMapping("/libro/form/{id}")
	public String editarLibro(@PathVariable Long id, Model model) {
		model.addAttribute("cabecera", "Modificar campos del libro seleccionado:");
		model.addAttribute("libro", libroService.findById(id));
		return "/libro/form";
	}
	
	
}
