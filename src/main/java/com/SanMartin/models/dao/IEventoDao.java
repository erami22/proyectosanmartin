package com.SanMartin.models.dao;
import org.springframework.data.repository.CrudRepository;

import com.SanMartin.models.entity.Evento;

public interface IEventoDao extends CrudRepository<Evento,Long>{

}
