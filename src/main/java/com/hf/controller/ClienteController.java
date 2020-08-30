package com.hf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hf.model.Cliente;
import com.hf.service.ClienteService;

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
		mv.addObject("clienteService", clienteList);
		return mv;
	}

	@RequestMapping()
	public String getCliente() {
		return "cliente";
	}

	@RequestMapping("/novo")
	public String getCadastroCliente() {
		return "cadastroCliente";
	}

}
