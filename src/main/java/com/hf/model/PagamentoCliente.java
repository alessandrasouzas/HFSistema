package com.hf.model;

public enum PagamentoCliente {
	
	DINHEIRO("DINHEIRO"),
	TRANSFERENCIA("TRANSFERÊNCIA"),
	BOLETO_07("BOLETO 07"),
	BOLETO_14("BOLETO 14"),
	BOLETO_21("BOLETO 21"),
	BOLETO_21_42("BOLETO 21/42");
	
	private String descricaoPagamento;
	
	PagamentoCliente(String descricaoPagamento){
		this.descricaoPagamento=descricaoPagamento;
	}
	
	public String getDescricaoPagamento() {
		return descricaoPagamento;
	}
	

}
