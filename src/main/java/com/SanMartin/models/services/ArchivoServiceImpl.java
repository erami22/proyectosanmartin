package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.IArchivoDao;
import com.SanMartin.models.entity.Archivo;

@Service
public class ArchivoServiceImpl implements IArchivoService {
	@Autowired
	private IArchivoDao archivoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Archivo> findAll() {
		
		return (List<Archivo>) archivoDao.findAll();
	}


}
