package com.jon.clientes.api.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jon.clientes.api.rest.models.entity.Cliente;
import com.jon.clientes.api.rest.models.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@CrossOrigin(origins = {"http://localhost:4200"})
	@GetMapping("/")
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}
}
