package com.hf.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hf.model.Cliente;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {


	public List<Cliente>findByNomeContaining(String nome);

	

	

	
}






