package com.hf.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Getter
//@Setter
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorDeCompra() {
		return valorDeCompra;
	}

	public void setValorDeCompra(Double valorDeCompra) {
		this.valorDeCompra = valorDeCompra;
	}

	public Double getValorDeVenda() {
		return valorDeVenda;
	}

	public void setValorDeVenda(Double valorDeVenda) {
		this.valorDeVenda = valorDeVenda;
	}

	public Double getMarkup() {
		return markup;
	}

	public void setMarkup(Double markup) {
		this.markup = markup;
	}
	
	
	
	
}
