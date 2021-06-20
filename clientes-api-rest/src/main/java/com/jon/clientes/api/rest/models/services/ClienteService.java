package com.jon.clientes.api.rest.models.services;

import java.util.List;

import com.jon.clientes.api.rest.models.entity.Cliente;

public interface ClienteService {
	
	List<Cliente> findAll();

}
