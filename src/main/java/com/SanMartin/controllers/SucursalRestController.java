package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Sucursal;
import com.SanMartin.models.services.ISucursalService;

    @RestController
	@RequestMapping("/api_sucursal")
	public class SucursalRestController {
		@Autowired
		private  ISucursalService sucursalService;
		
		@GetMapping("/sucursales")
		public List<Sucursal> index(){
			return sucursalService.findAll();


		}

}
