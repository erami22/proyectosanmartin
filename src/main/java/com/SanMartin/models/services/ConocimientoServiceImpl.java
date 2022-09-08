package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.SanMartin.models.dao.IConocimientoDao;
import com.SanMartin.models.entity.Conocimiento;


@Service
public class ConocimientoServiceImpl implements IConocimientoService{
	@Autowired
	private IConocimientoDao conocimientoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Conocimiento> findAll() {
		
		return (List<Conocimiento>) conocimientoDao.findAll();
	}

}
