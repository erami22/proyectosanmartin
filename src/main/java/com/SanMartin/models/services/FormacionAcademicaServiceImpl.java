package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.IFormacionAcademicaDao;
import com.SanMartin.models.entity.FormacionAcademica;

@Service
public class FormacionAcademicaServiceImpl implements IFormacionAcademicaService{
	@Autowired
	private IFormacionAcademicaDao formacionacademicaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<FormacionAcademica> findAll() {
		
		return (List<FormacionAcademica>) formacionacademicaDao.findAll();
	}



}
