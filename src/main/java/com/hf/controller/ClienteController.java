package com.hf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hf.entity.Cliente;
import com.hf.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping(value = { "/cliente" })
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "cliente";
	}

	// METODO QUE RETORNA A VIEW DE PESQUISA
	@GetMapping("/cliente/find-all")
	public ModelAndView pesquisa() {
		List<Cliente> clienteList = clienteService.findAll();
		ModelAndView mv = new ModelAndView("cliente");
		mv.addObject("clienteService", clienteList);
		return mv;
	}

//	@GetMapping("/find-all")
//	public List<Cliente> getCliente() {
//		return clienteService.findAll();
//	}
}
