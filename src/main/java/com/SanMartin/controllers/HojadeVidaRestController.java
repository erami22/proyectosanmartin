package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.HojadeVida;
import com.SanMartin.models.services.IHojadeVidaService;

@RestController
@RequestMapping("/api_hojadevida")

public class HojadeVidaRestController {
	
	@Autowired
	private  IHojadeVidaService hojadevidaService;
	
	@GetMapping("/hojadevidas")
	public List<HojadeVida> index(){
		return hojadevidaService.findAll();
	}

}
