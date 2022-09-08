package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SanMartin.models.entity.FormacionAcademica;
import com.SanMartin.models.services.IFormacionAcademicaService;


@RestController
@RequestMapping("/api_formacion_academica")

public class FormacionAcademicaRestController {
	@Autowired
	private  IFormacionAcademicaService formacionacademicaService;
	
	@GetMapping("/formacionacademicas")
	public List<FormacionAcademica> index(){
		return formacionacademicaService.findAll();
	}

}
