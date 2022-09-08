package com.SanMartin.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "tipoformularios")

public class tipoFormulario implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String conHoras;
	private String conFechaRetorno;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getConHoras() {
		return conHoras;
	}

	public void setConHoras(String conHoras) {
		this.conHoras = conHoras;
	}

	public String getConFechaRetorno() {
		return conFechaRetorno;
	}

	public void setConFechaRetorno(String conFechaRetorno) {
		this.conFechaRetorno = conFechaRetorno;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
