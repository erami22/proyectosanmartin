package com.SanMartin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SanMartin.models.entity.Funcionario;
import com.SanMartin.models.services.IFuncionarioService;


@RestController
@RequestMapping("/api_funcionario")


public class FuncionarioRestController {
	@Autowired
	private  IFuncionarioService funcionarioService;
	
	@GetMapping("/funcionarios")
	public List<Funcionario> index(){
		return funcionarioService.findAll();


	}
	
	

}
