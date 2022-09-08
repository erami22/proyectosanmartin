package com.SanMartin.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.SanMartin.models.entity.Persona;

public interface IPersonaDao extends CrudRepository<Persona,Long> {

}
