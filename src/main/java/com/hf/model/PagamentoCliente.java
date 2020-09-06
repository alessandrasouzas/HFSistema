package com.hf.model;

public enum PagamentoCliente {
	
	DINHEIRO("Dinheiro"),
	TRANSFERENCIA("Transferência"),
	BOLETO_07("Boleto 07"),
	BOLETO_14("Bleto 14"),
	BOLETO_21("Boleto 21"),
	BOLETO_21_42("Boleto 21/42");
	
	private String descricaoPagamento;
	
	PagamentoCliente(String descricaoPagamento){
		this.descricaoPagamento=descricaoPagamento;
	}
	
	public String getDescricaoPagamento() {
		return descricaoPagamento;
	}
	

}
