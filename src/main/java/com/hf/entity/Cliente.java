package com.hf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Cliente")
public class Cliente {
	
	@Id
	@Column(name="nome")
	private String nome;

}
