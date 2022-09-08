package com.SanMartin.models.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.ICatalogoDao;
import com.SanMartin.models.entity.Catalogo;


@Service

public class CatalogoServiceImpl implements ICatalogoService{
	@Autowired
	private ICatalogoDao catalogoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Catalogo> findAll() {
		
		return (List<Catalogo>) catalogoDao.findAll();
	}

}
