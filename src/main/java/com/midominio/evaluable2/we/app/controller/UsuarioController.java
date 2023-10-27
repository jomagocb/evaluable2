package com.midominio.evaluable2.we.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.midominio.evaluable2.we.app.model.entity.Usuario;
import com.midominio.evaluable2.we.app.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	UsuarioService usuarioService;
	
	@ModelAttribute("tituloNavegador")
	private String tituloNavegador() {return "Biblioteca";}
	
	@GetMapping("/lista-usuarios")
	public String listaCompleta(Model model) {
		model.addAttribute("listadoCompleto", usuarioService.findAll());
		return "/usuario/lista-usuarios";
	}
	@GetMapping("/lista-usuarios/borrar/{id}")
	public String borrarUsuario(@PathVariable Long id) {
		usuarioService.borrarUsuario(id);
		return "redirect:/lista-usuarios";
	}
	@GetMapping("/usuario/form")
	public String formularioVacio(Model model) {
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("cabecera", "Nuevo usuario:");
		return "/usuario/form";
	}
	
	@PostMapping("/usuario/form")
	public String guardaUnUsuario(Usuario usuario) {
		usuarioService.save(usuario);
		return "redirect:/lista-usuarios";
	}
	
	@GetMapping("/usuario/form/{id}")
	public String editarUsuario(@PathVariable Long id, Model model) {
		model.addAttribute("cabecera", "Modificar campos del usuario seleccionado:");
		model.addAttribute("usuario", usuarioService.findById(id));
		return "/usuario/form";
	}
	
}
