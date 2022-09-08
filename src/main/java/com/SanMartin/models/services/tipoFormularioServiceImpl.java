package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.SanMartin.models.dao.ItipoFormularioDao;
import com.SanMartin.models.entity.tipoFormulario;

@Service
public class tipoFormularioServiceImpl implements ItipoFormularioService{
	
	@Autowired
	private ItipoFormularioDao tipoformularioDao;
	
	@Override
	
	@Transactional(readOnly = true)
	public List<tipoFormulario> findAll() {
		
		return (List<tipoFormulario>) tipoformularioDao.findAll();
	}


}
