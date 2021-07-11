package com.jon.clientes.api.rest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jon.clientes.api.rest.models.dao.ClienteDao;
import com.jon.clientes.api.rest.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteDao clienteDao;

	public List<Cliente> findAll() {
		return (List<Cliente>) clienteDao.findAll();
	}
	
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}
	
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}
}
