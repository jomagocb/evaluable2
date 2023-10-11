package com.midominio.evaluable2.we.app.model;

public class Usuario {

	private String nombre;
	private String email;
	private String direccion;
	private int codigoPostal;
	private int idReserva;

	// Getters, no setters
	public String getNombre() {
		return nombre;
	}

	public String getEmail() {
		return email;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public int getIdReserva() {
		return idReserva;
	}

	// Constructor

	public Usuario(String nombre, String email, String direccion, int codigoPostal, int idReserva) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.idReserva = idReserva;
	}

}
