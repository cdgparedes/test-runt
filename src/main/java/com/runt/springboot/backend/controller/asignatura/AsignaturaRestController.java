package com.runt.springboot.backend.controller.asignatura;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.springboot.backend.asignatura.models.entity.Asignatura;
import com.runt.springboot.backend.models.service.asignatura.IAsignaturaService;

@RestController
@RequestMapping("/asignatura")
public class AsignaturaRestController {
	
	@Autowired
	IAsignaturaService asignaturaService;
	
	@GetMapping("/listarAsignaturas/{id}")
	public List<Asignatura> showAsignatura(@PathVariable Long id){
		 return asignaturaService.findToidTeacher(id);
	 }
}
