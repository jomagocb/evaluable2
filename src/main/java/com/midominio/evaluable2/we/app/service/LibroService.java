package com.midominio.evaluable2.we.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.midominio.evaluable2.we.app.controller.Coche;
import com.midominio.evaluable2.we.app.model.dao.LibroRepository;
import com.midominio.evaluable2.we.app.model.entity.Libro;

@Service
public class LibroService {

	@Autowired
	public LibroRepository libroRepository;
	
	public Iterable<Libro> findAll(){
		return libroRepository.findAll();
	}
	public int sumaUnLibro(Long id) {
		Libro libro = libroRepository.findById(id).orElse(null);
		int cantidadLibros = libro.getCantidadLibros();
		cantidadLibros++;
		libro.setCantidadLibros(cantidadLibros);
		libroRepository.save(libro);
		return cantidadLibros;
	}
	public void borrarLibro(Long id) {
		libroRepository.deleteById(id);
	}
	public Optional<Libro> findById(Long id){
		return libroRepository.findById(id);
	}
	public Libro save(Libro libro) {
		return libroRepository.save(libro);
	}
	
	
	
}
