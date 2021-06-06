package com.runt.springboot.backend.curso.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso  implements 	Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int grado;
	private String  salon;
	
	@Column(name="id_asignatura")
	private String idasignatura;
	
	public int getGrado() {
		return grado;
	}
	public void setGrado(int grado) {
		this.grado = grado;
	}
	public String getSalon() {
		return salon;
	}
	public void setSalon(String salon) {
		this.salon = salon;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdasignatura() {
		return idasignatura;
	}
	public void setIdasignatura(String idasignatura) {
		this.idasignatura = idasignatura;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Curso [id=" + id + ", grado=" + grado + ", salon=" + salon + ", idasignatura=" + idasignatura + "]";
	}
	
	

	
}
