package com.SanMartin.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.SanMartin.models.entity.Curso;

public interface ICursoDao extends CrudRepository<Curso,Long> {

}
