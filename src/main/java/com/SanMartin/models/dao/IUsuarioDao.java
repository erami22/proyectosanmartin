package com.SanMartin.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.SanMartin.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario,Long> {

}
