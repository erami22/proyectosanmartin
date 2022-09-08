package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Catalogo;
import com.SanMartin.models.services.ICatalogoService;



@RestController
@RequestMapping("/api_catalogo")

public class CatalogoRestController {
	@Autowired
	private  ICatalogoService catalogoService;
	
	@GetMapping("/catalogos")
	public List<Catalogo> index(){
		return catalogoService.findAll();
	}

}
