package com.midominio.evaluable2.we.app.model;

public class Libro {

	private int cantidad;
	private int id;
	private String nombreAutor;
	private String primerApellido;
	private int publicadoEn;
	private String titulo;
	private String ciudad;
	private String pais;
	private String editorial;
	
	//Getters, no setters
	
	public String getNombreAutor() {
		return nombreAutor;
	}
	public int getId() {
		return id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public int getPublicadoEn() {
		return publicadoEn;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getCiudad() {
		return ciudad;
	}
	public String getPais() {
		return pais;
	}
	public String getEditorial() {
		return editorial;
	}
	
	//Constructor
	public Libro(int cantidad, String nombreAutor, int id, String primerApellido, int publicadoEn, String titulo, String ciudad,
			String pais, String editorial) {
		super();
		this.cantidad = cantidad;
		this.nombreAutor = nombreAutor;
		this.id = id;
		this.primerApellido = primerApellido;
		this.publicadoEn = publicadoEn;
		this.titulo = titulo;
		this.ciudad = ciudad;
		this.pais = pais;
		this.editorial = editorial;
	}
	


	
	
}
