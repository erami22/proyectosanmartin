package com.SanMartin.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.SanMartin.models.entity.Funcionario;

public interface IFuncionarioDao extends CrudRepository<Funcionario,Long>{

}
