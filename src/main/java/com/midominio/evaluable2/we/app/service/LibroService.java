package com.midominio.evaluable2.we.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.midominio.evaluable2.we.app.model.Libro;

@Service
public class LibroService {

	
	public List<Libro> listaCompletaLibros(){
		List<Libro> lista = new ArrayList<>();
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		lista.add(new Libro(4, "Karel", 1, "Kosic", 1967, "Dialectica de lo concreto", "Moscú", "Rusia", "Dos cuadrados"));
		
		return lista;
	}
}
