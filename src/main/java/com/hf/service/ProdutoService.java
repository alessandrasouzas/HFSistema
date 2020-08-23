package com.hf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import  com.hf.entity.Produto;
import  com.hf.repository.ProdutoRepository;

@Component
@Service
public class ProdutoService {

	
	private ProdutoRepository repository;
		
	
	public ProdutoService(ProdutoRepository repository) {
		super();
		this.repository = repository;
	}

	
	public Optional<Produto> buscarProduto(Integer id) {
		return repository.findById(id);
	}

	
	public List<Produto> buscarTodosProdutos() {
		return repository.findAll();
	}

}
