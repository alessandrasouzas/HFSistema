package com.hf.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.model.Cliente;
import com.hf.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public void cadastrar(Cliente cliente) {
		System.out.println("chamando o repository -> salvando o cliente");
		clienteRepository.save(cliente);
		
	}

}
