package com.hf.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hf.enums.PagamentoCliente;
import com.hf.enums.UfCliente;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	
	private String nome;
	
	private String cnpj;
	
	private String telefone;
	
	@Enumerated(EnumType.STRING)
	private PagamentoCliente pagamento;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private String cep;
	
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	private UfCliente uf;
	
	private String observacao;
	
	private String nomeContato;
	
	private String telefoneContato;
	
	private String emailContato;
	
}
