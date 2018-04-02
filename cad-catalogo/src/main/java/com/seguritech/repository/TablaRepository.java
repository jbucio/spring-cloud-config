package com.seguritech.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguritech.model.Tabla;

@Repository
public interface TablaRepository  extends JpaRepository<Tabla, Long>{

}
