package com.runt.springboot.backend.models.service.asignatura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.runt.springboot.backend.asignatura.models.dao.IAsignaturaDao;
import com.runt.springboot.backend.asignatura.models.entity.Asignatura;

public class AsignaturaServiceImpl implements IAsignaturaService{
	@Autowired
	IAsignaturaDao asignaturaDao; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findToidTeacher(int id) {
		// TODO Auto-generated method stub
		return asignaturaDao.findToidTeacher(id);
	}

}
