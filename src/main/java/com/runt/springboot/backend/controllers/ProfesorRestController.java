package com.runt.springboot.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.runt.springboot.backend.models.service.IProfesorService;
import com.runt.springboot.backend.profesor.models.entity.Profesor;

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/profesor")
public class ProfesorRestController {
	
	
	@Autowired
	IProfesorService profesorService;
	
	@GetMapping("/listarprofesor")
	public List<Profesor> index(){
		return profesorService.findAll();
	}
}
