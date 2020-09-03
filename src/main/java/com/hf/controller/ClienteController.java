package com.hf.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.hf.model.Cliente;
import com.hf.service.ClienteService;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	

	// Retorna a home view cliente
	@GetMapping()
	public ModelAndView pesquisar() {
		List<Cliente> clienteList = clienteService.findAll();
		ModelAndView mv = new ModelAndView("cliente");
		mv.addObject("clientes", clienteList);
		return mv;
	}

	@RequestMapping("/cadastro")
	public String novo() {
		return "cadastroCliente";
	}
	

	@PostMapping
	public ModelAndView salvar(Cliente cliente) {		
		clienteService.cadastrar(cliente);
		ModelAndView mv = new ModelAndView("cadastroCliente");
		mv.addObject("mensagem", "cliente salvo com sucesso!");
		return mv;
	}
	
	 

}
