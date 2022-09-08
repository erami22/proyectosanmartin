package com.SanMartin.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.tipoFormulario;
import com.SanMartin.models.services.ItipoFormularioService;

@RestController
@RequestMapping("/api_tipoFormulario")
public class tipoFormularioRestController {

	@Autowired
	private  ItipoFormularioService tipoformularioService;
	
	@GetMapping("/tipoformularios")
	public List<tipoFormulario> index(){
		return tipoformularioService.findAll();
	}

}

