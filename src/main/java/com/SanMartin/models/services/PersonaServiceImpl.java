package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.IPersonaDao;
import com.SanMartin.models.entity.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{
    
	@Autowired
	private IPersonaDao personaDao;
	
	@Override
	
	@Transactional(readOnly = true)
	public List<Persona> findAll() {
		
		return (List<Persona>) personaDao.findAll();
	}

}
