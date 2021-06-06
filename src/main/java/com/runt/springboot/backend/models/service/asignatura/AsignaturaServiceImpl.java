package com.runt.springboot.backend.models.service.asignatura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runt.springboot.backend.asignatura.models.dao.IAsignaturaDao;
import com.runt.springboot.backend.asignatura.models.entity.Asignatura;

@Service
public class AsignaturaServiceImpl implements IAsignaturaService{
	@Autowired
	IAsignaturaDao asignaturaDao; 
	
	@Override
	@Transactional(readOnly = true)
	public List<Asignatura> findToidTeacher(Long id) {
		// TODO Auto-generated method stub
		return asignaturaDao.findToidTeacher(id);
	}

}
