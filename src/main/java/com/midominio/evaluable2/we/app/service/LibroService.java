package com.midominio.evaluable2.we.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return cantidadLibros; //revisa el return, ¿Que quiero que me muestre?
		//get por id, sumo uno y save.
		
	}
	
	
	
	
}
