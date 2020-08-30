package com.hf.enums;

public enum PagamentoCliente {
	
	DINHEIRO("Dinheiro"),
	TRANSFERENCIA("Transferência"),
	BOLETO_07("Boleto 07"),
	BOLETO_14("Bleto 14"),
	BOLETO_21("Boleto 21"),
	BOLETO_21_42("Boleto 21-42");
	
	private String descricao;
	
	PagamentoCliente(String descricao){
		this.descricao=descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
