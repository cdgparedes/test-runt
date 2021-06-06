package com.runt.springboot.backend.models.service.asignatura;

import java.util.List;

import com.runt.springboot.backend.asignatura.models.entity.Asignatura;

public interface IAsignaturaService  {
	public List<Asignatura> findToidTeacher(Long id);
}
