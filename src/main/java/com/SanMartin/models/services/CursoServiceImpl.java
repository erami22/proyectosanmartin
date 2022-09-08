package com.SanMartin.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SanMartin.models.dao.ICursoDao;
import com.SanMartin.models.entity.Curso;


@Service

public class CursoServiceImpl implements ICursoService{
	@Autowired
	private ICursoDao cursoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Curso> findAll() {
		
		return (List<Curso>) cursoDao.findAll();
	}

}
