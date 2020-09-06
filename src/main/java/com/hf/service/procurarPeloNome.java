package com.hf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hf.model.Cliente;
import com.hf.repository.ClienteRepository;

@Service
public class procurarPeloNome {

	@Autowired
	private ClienteRepository clienteRepository;
	
	public List<Cliente> buscarPeloNome(String nome) {
		//System.out.println("chamando o repository ->buscando lista de  cliente no banco");
		return clienteRepository.findByNomeContaining(nome);
	}

	public void cadastrar(Cliente cliente) {
		//System.out.println("chamando o repository -> salvando o cliente no banco");
		clienteRepository.save(cliente);
		
	}

	public Optional<Cliente> buscarPeloId(Long id) {
		//System.out.println("chamando o repository -> Editando o cliente no banco");
		return clienteRepository.findById(id);
	}

	
	public void removerPeloId(Long id) {
		clienteRepository.deleteById(id);
		//System.out.println("chamando o repository -> Excluindo o cliente no banco");		
	}
	
	
	
	

	


}
