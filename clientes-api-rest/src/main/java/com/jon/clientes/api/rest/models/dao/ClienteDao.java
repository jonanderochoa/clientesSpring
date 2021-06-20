package com.jon.clientes.api.rest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.jon.clientes.api.rest.models.entity.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {

}
