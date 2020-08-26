package com.hf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.hf.entity.Produto;
import com.hf.service.ProdutoService;

@Controller
public class ProdutoController {

	@Autowired
	private ProdutoService service;
	
	@GetMapping("/produto")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "produto";
	}
	
	@GetMapping("/{id}")
	public Optional<Produto> buscarProduto(@PathVariable("id") Integer id) {
		Optional<Produto> result = service.buscarProduto(id);		
		return result;
	}
	
/*
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Produto>> buscarProduto(@PathVariable("id") Integer id) {
		Optional<Produto> produto = service.buscarProduto(id);
		return ResponseEntity.ok(produto);
	}
*/
	@GetMapping("/buscar-todos")
	public ResponseEntity<List<Produto>> buscarTodosProdutos() {
		List<Produto> produtoList = service.buscarTodosProdutos();
		return ResponseEntity.ok(produtoList);
	}
	
	

}
