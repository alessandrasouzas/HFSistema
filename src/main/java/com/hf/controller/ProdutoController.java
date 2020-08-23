package com.hf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hf.entity.Produto;
import com.hf.service.ProdutoService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService service;

	public ProdutoController(ProdutoService service) {
		this.service = service;
	}

	@GetMapping("/{id}")
	public ResponseEntity<Optional<Produto>> buscarProduto(@PathVariable("id") Integer id) {
		Optional<Produto> produto = service.buscarProduto(id);
		return ResponseEntity.ok(produto);
	}

	@GetMapping("/buscar-todos")
	public ResponseEntity<List<Produto>> buscarTodosProdutos() {
		List<Produto> produtoList = service.buscarTodosProdutos();
		return ResponseEntity.ok(produtoList);
	}

}
