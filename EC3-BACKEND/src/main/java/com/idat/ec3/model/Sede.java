package com.idat.ec3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sede")
public class Sede {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSede;
	
	@Column(name="sede", length = 50, nullable = false)
	private String sede;

	public Long getIdSede() {
		return idSede;
	}

	public void setIdSede(Long idSede) {
		this.idSede = idSede;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}
	
	
}
