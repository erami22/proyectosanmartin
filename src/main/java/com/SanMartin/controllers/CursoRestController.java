package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Curso;
import com.SanMartin.models.services.ICursoService;



@RestController
@RequestMapping("/api_curso")

public class CursoRestController {
	@Autowired
	private  ICursoService cursoService;
	
	@GetMapping("/cursos")
	public List<Curso> index(){
		return cursoService.findAll();
	}


}
