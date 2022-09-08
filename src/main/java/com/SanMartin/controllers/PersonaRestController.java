package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Persona;
import com.SanMartin.models.services.IPersonaService;

@RestController
@RequestMapping("/api")
public class PersonaRestController {
	
	@Autowired
	private  IPersonaService personaService;
	
	@GetMapping("/personas")
	public List<Persona> index(){
		return personaService.findAll();
	}
	
  
}
