package com.runt.springboot.backend.asignatura.models.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.runt.springboot.backend.curso.models.entity.Curso;
import com.runt.springboot.backend.estudiante.models.entity.Estudiante;
import com.runt.springboot.backend.profesor.models.entity.Profesor;

@Entity
@Table(name="asignaturas")
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
	/*
	@Column(name="id_estudiante")
	private long idEstudiante;
	*/
	@Column(name="id_curso")
	private long idCurso;
	
	@ManyToOne
	@JoinColumn(name="asig_profesor")
    Profesor profesor;
	
	
	@ManyToOne
	@JoinColumn(name="asig_curso")
    Curso curso;
	
	
	@ManyToMany
	@JoinTable(name="asignatura_estudiante",
				joinColumns = @JoinColumn(name="asignatura_id"),
				inverseJoinColumns = @JoinColumn(name="estudiante_id")
	)
	private List<Estudiante>  estudiante;
	

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

	public long getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Estudiante> getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(List<Estudiante> estudiante) {
		this.estudiante = estudiante;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", nombre=" + nombre + ", idProfesor=" + idProfesor + ", idCurso=" + idCurso
				+ ", profesor=" + profesor + ", curso=" + curso + ", estudiante=" + estudiante + "]";
	}

	
	
	
	
	
	
	
}
