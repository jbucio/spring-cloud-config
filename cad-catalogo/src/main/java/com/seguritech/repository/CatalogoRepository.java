package com.seguritech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.seguritech.model.Catalogo;

@Repository
public interface CatalogoRepository  extends JpaRepository<Catalogo, Long>{

	@Query("FROM Catalogo C WHERE C.idTabla = :idTabla")
	List<Catalogo> findByIdTabla(@Param("idTabla") long idTabla);
}
