package com.hf.enums;

public enum UfClienteEnum {

		AC("AC"),
		AP("AP"),
		AM("AM"),
		PA("PA"),
		RO("RO"),
		RR("RR"),
		TO("TO"),
		AL("AL"),
		BA("BA"),
		CE("CE"),
		MA("MA"),
		PB("PB"),
		PE("PE"),
		PI("PI"),
		RN("RN"),
		SE("SE"),
		DF("DF"),
		GO("GO"),
		MT("MT"),
		MS("MS"),
		ES("ES"),
		MG("MG"),
		RJ("RJ"),
		SP("SP"),
		PR("PR"),
		RS("RS"),
		SC("SC");
		
	private String descricaoUf;
		
		UfClienteEnum(String descricaoUf){
			this.descricaoUf=descricaoUf;
		}
		
		public String getDescricaoUf() {
			return descricaoUf;
		}

}
