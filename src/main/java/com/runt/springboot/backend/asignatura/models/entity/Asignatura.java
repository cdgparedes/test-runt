package com.runt.springboot.backend.asignatura.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Asignatura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	private String nombre;
	
	@Column(name="id_profesor")
	private long idProfesor;
	
	@Column(name="id_estudiante")
	private long idEstudiante;
	
	@Column(name="id_curso")
	private long idCurso;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(long idProfesor) {
		this.idProfesor = idProfesor;
	}

	public long getIdEstudiante() {
		return idEstudiante;
	}

	public void setIdEstudiante(long idEstudiante) {
		this.idEstudiante = idEstudiante;
	}

	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", idProfesor=" + idProfesor + ", idEstudiante="
				+ idEstudiante + ", idCurso=" + idCurso + "]";
	}
	
	
	
	
	
	
}
