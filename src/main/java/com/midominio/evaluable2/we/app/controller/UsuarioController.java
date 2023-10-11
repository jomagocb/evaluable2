package com.midominio.evaluable2.we.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

	@GetMapping("/inicio/usuario")
	public String usuarioInicio(Model model) {
		
		return "/usuario/usuario";
	}
}
