package com.hf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hf.model.Produto;
import com.hf.service.ProdutoService;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping()
	public ModelAndView pesquisar() {
		List<Produto> produtoLista = produtoService.findAll();
		ModelAndView mv = new ModelAndView("produto");
		mv.addObject("produtoService", produtoLista);
		return mv;		
	}
	
	

}
