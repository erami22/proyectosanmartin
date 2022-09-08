package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.IFuncionarioDao;
import com.SanMartin.models.entity.Funcionario;



@Service
public class FuncionarioServiceImpl implements  IFuncionarioService{
	@Autowired
	private IFuncionarioDao funcionarioDao;
	
	@Override
	
	@Transactional(readOnly = true)
	public List<Funcionario> findAll() {
		
		return (List<Funcionario>) funcionarioDao.findAll();
	}

}
