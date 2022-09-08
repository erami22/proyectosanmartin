package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Idioma;
import com.SanMartin.models.services.IIdiomaService;



@RestController
@RequestMapping("/api_idioma")

public class IdiomaRestController {
	@Autowired
	private  IIdiomaService idiomaService;
	
	@GetMapping("/idiomas")
	public List<Idioma> index(){
		return idiomaService.findAll();
	}


}
