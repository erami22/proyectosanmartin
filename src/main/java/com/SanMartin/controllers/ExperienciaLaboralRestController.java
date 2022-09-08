package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SanMartin.models.entity.ExperienciaLaboral;
import com.SanMartin.models.services.IExperienciaLaboralService;


@RestController
@RequestMapping("/api_experiencialaboral")

public class ExperienciaLaboralRestController {
	@Autowired
	private  IExperienciaLaboralService experiencialaboralService;
	
	@GetMapping("/experienciaslaborales")
	public List<ExperienciaLaboral> index(){
		return experiencialaboralService.findAll();
	}


}
