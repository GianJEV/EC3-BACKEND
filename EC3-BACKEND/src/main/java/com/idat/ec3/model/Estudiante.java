package com.idat.ec3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEstudiante;
	
	@Column(name="dni", length = 8, nullable = false)
	private String dni;
	
	@Column(name="nombres", length = 50, nullable = false)
	private String nombres;
	
	@Column(name="apellidos", length = 50, nullable = false)
	private String apellidos;
	
	@Column(name="direccion", length = 50, nullable = false)
	private String direccion;
	
	@Column(name="email", length = 50, nullable = false)
	private String email;
	
	@Column(name="numero", length = 9, nullable = false)
	private String numero;
	
	@Column(name="ciclo", length = 20, nullable = false)
	private String ciclo;
	
	@ManyToOne
	@JoinColumn(name="idCarrera")
	private Carrera carrera;
	
	@ManyToOne
	@JoinColumn(name="idSede")
	private Sede sede;

	public Long getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(Long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}

	public Sede getSede() {
		return sede;
	}

	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	
}
