package com.midominio.evaluable2.we.app.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.midominio.evaluable2.we.app.model.entity.Libro;
import java.util.List;


public interface LibroRepository extends CrudRepository<Libro, Long> {
	List<Libro> findByNombreAutor(String nombreAutor);
}
