package com.seguritech.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seguritech.model.Campo;

@Repository
public interface CampoRepository  extends JpaRepository<Campo, Long>{

}
