package com.SanMartin.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import javax.persistence.Id;

@Entity
@Table(name = "hojadevidas")

public class HojadeVida implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String lugarDeResidencia;
	private String perfilProfecional;
	private String colegioProfecional;
	private String NumRegistroColegio;
	private String informacion;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getLugarDeResidencia() {
		return lugarDeResidencia;
	}

	public void setLugarDeResidencia(String lugarDeResidencia) {
		this.lugarDeResidencia = lugarDeResidencia;
	}

	public String getPerfilProfecional() {
		return perfilProfecional;
	}

	public void setPerfilProfecional(String perfilProfecional) {
		this.perfilProfecional = perfilProfecional;
	}

	public String getColegioProfecional() {
		return colegioProfecional;
	}

	public void setColegioProfecional(String colegioProfecional) {
		this.colegioProfecional = colegioProfecional;
	}

	public String getNumRegistroColegio() {
		return NumRegistroColegio;
	}

	public void setNumRegistroColegio(String numRegistroColegio) {
		NumRegistroColegio = numRegistroColegio;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
