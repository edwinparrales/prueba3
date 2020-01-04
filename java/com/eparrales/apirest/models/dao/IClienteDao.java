package com.eparrales.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.eparrales.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
