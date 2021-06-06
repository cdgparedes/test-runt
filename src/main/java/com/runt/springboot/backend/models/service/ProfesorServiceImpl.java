package com.runt.springboot.backend.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.runt.springboot.backend.models.dao.IProfesorDao;
import com.runt.springboot.backend.profesor.models.entity.Profesor;

@Service
public class ProfesorServiceImpl implements IProfesorService {
	
	@Autowired
    IProfesorDao  profesorDao;
	
	
	@Override
	@Transactional(readOnly = true)
	public List<Profesor> findAll() {
		return (List<Profesor>) profesorDao.findAll();
	}

}
