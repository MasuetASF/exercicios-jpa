package com.example.exerciciossb.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.example.exerciciossb.model.entities.Produto;

public interface ProdutoRepository
	extends PagingAndSortingRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	
//	findByNomeContaining
//	findByNomeIsContaining
//	findByNomeContains
//	
//	findBYNomeStartsWhith
//	findBYNomeEndsWhith
//	
//	findBYNotContaining
	
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param ("nome") String nome);
	
	
}
