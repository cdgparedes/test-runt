package com.runt.springboot.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.runt.springboot.backend.profesor.models.entity.Profesor;

public interface IProfesorDao  extends CrudRepository<Profesor, Long>{

 

}
