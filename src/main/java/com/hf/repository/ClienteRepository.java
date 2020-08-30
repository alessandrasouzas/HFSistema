package com.hf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hf.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
}
