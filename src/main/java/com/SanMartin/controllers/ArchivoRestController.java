package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Archivo;
import com.SanMartin.models.services.IArchivoService;



@RestController
@RequestMapping("/api_archivo")
public class ArchivoRestController {
	@Autowired
	private  IArchivoService archivoService;
	
	@GetMapping("/archivos")
	public List<Archivo> index(){
		return archivoService.findAll();
	}


}
