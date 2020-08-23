package com.hf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="TProduto")
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="PROD_NOME")
	private String nome;

	@Column(name="PROD_DESCRICAO")
	private String descricao;
	
	@Column(name="PROD_VALOR_COMPRA")
	private Double valorDeCompra;
	
	@Column(name="PROD_VALOR_VENDA")
	private Double valorDeVenda;
	
	@Column(name="PROD_MARKUP")
	private Double markup;
	
	
}
