package com.recode.api.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.recode.api.domain.Categoria;
import com.recode.api.domain.Conto;

@Transactional
public interface ContoRepository extends JpaRepository<Conto, Integer> {

	@Query(value =" select * from conto where categoria_id = :categoriaId", nativeQuery = true)
	List<Conto> retrieveByCategoria(@Param("categoriaId") Integer id);
}
