package com.runt.springboot.backend.models.service;

import java.util.List;

import com.runt.springboot.backend.profesor.models.entity.Profesor;

public interface IProfesorService {
	public List<Profesor> findAll();

}
