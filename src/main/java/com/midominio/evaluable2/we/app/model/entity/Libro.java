package com.midominio.evaluable2.we.app.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "cantidad_libros")
	private Integer cantidadLibros;
	@Column(name = "nombre_autor")
	private String nombreAutor;
	@Column(name = "primer_apellido")
	private String primerApellido;
	@Column(name = "fecha_publicacion")
	private int publicadoEn;
	private String titulo;
	private String ciudad;
	private String pais;
	private String editorial;

	public Libro() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidadLibros() {
		return cantidadLibros;
	}

	public void setCantidadLibros(Integer cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	public String getNombreAutor() {
		return nombreAutor;
	}

	public void setNombreAutor(String nombreAutor) {
		this.nombreAutor = nombreAutor;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public int getPublicadoEn() {
		return publicadoEn;
	}

	public void setPublicadoEn(int publicadoEn) {
		this.publicadoEn = publicadoEn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}


}
