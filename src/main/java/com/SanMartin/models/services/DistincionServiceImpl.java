package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.SanMartin.models.dao.IDistincionDao;
import com.SanMartin.models.entity.Distincion;


@Service
public class DistincionServiceImpl implements IDistincionService{
	@Autowired
	private IDistincionDao distincionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Distincion> findAll() {
		
		return (List<Distincion>) distincionDao.findAll();
	}

}
