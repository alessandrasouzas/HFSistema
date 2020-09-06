package com.hf.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.hf.model.Cliente;
import com.hf.service.procurarPeloNome;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private procurarPeloNome clienteService;
	

	//Carrega a view cliente com todos os registros na tabela
	@GetMapping
	public ModelAndView pesquisar(@RequestParam(defaultValue="") String nome) {
		List<Cliente> clienteList = clienteService.buscarPeloNome(nome);
		ModelAndView mv = new ModelAndView("cliente");
		mv.addObject("clientes", clienteList);
		return mv;
	}
	

	//Carrega a view cliente/cadastro	
	@GetMapping("/cadastro")
	public ModelAndView carregarPagina() {
		ModelAndView mv = new ModelAndView ("cadastroCliente");
		mv.addObject(new Cliente());
		return mv;
	}
	

	// Salva registro no bd e Retorna para view cliente/cadastro
	@PostMapping
	public String salvar(@Validated Cliente cliente, Errors errors,RedirectAttributes attributes) {	
		if(errors.hasErrors()){
			return "cadastroCliente";
		}
		clienteService.cadastrar(cliente);
		attributes.addFlashAttribute("mensagem", "cliente salvo com sucesso!");
		return "redirect:/cliente/cadastro";
	}
	

	
	//Envia um registro expecífico pra ser editado. (url cliente/{id}) via get	
	@GetMapping("{id}")
	public ModelAndView editarDados(@PathVariable("id") Long id){
		Optional<Cliente> clienteResult = clienteService.buscarPeloId(id);
		ModelAndView mv=new ModelAndView("cadastroCliente");
		mv.addObject("cliente", clienteResult);
		return mv;
	}
	

	//Exclui um registro expecífico. (url cliente/{id}) via post
	@PostMapping("{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attributes){
		clienteService.removerPeloId(id);
		attributes.addFlashAttribute("mensagem", "Cliente excluido com sucesso!");
		return "redirect:/cliente";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
