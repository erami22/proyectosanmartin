package com.SanMartin.models.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name = "idiomas")

public class Idioma implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String habla;
	private String lee;
	private String escribe;
	public Long getId(){
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

	public String getHabla() {
		return habla;
	}

	public void setHabla(String habla) {
		this.habla = habla;
	}

	public String getLee() {
		return lee;
	}

	public void setLee(String lee) {
		this.lee = lee;
	}

	public String getEscribe() {
		return escribe;
	}

	public void setEscribe(String escribe) {
		this.escribe = escribe;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
