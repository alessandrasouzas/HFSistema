package com.hf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hf.entity.Produto;

@Component
@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
	
	List<Produto> findByDescricao(String descricao);
	
	
}
