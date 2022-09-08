package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.IExperienciaLaboralDao;
import com.SanMartin.models.entity.ExperienciaLaboral;


@Service
public class ExperienciaLaboralServiceImpl implements IExperienciaLaboralService{
	@Autowired
	private IExperienciaLaboralDao experiencialaboralDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<ExperienciaLaboral> findAll() {
		
		return (List<ExperienciaLaboral>) experiencialaboralDao.findAll();
	}


}
