package com.midominio.evaluable2.we.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midominio.evaluable2.we.app.model.dao.UsuarioRepository;
import com.midominio.evaluable2.we.app.model.entity.Usuario;

@Service
public class UsuarioService {
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Iterable<Usuario> findAll(){
		return usuarioRepository.findAll();
	}
	public void borrarUsuario(Long id) {
		usuarioRepository.deleteById(id);
	}
	public Optional<Usuario> findById(Long id){
		return usuarioRepository.findById(id);
	}
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
}
