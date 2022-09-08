package com.SanMartin.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Distincion;
import com.SanMartin.models.services.IDistincionService;



@RestController
@RequestMapping("/api_distincion")

public class DistincionRestController {
	@Autowired
	private  IDistincionService distincionService;
	
	@GetMapping("/distinciones")
	public List<Distincion> index(){
		return distincionService.findAll();
	}



}
