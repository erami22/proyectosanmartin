package com.SanMartin.models.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.IHojadeVidaDao;
import com.SanMartin.models.entity.HojadeVida;

@Service

public class HojadeVidaServiceImpl implements IHojadeVidaService{
	@Autowired
	private IHojadeVidaDao hojadevidaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<HojadeVida> findAll() {
	
		return (List<HojadeVida>) hojadevidaDao.findAll();
	}
	

}

