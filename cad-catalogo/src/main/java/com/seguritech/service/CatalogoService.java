package com.seguritech.service;

import java.util.List;
import java.util.Optional;

import com.seguritech.model.Catalogo;

public interface CatalogoService {

	List<Catalogo> getAllCatalogo();

	Optional<Catalogo> getCatalogoById(long id);

	List<Catalogo> getCatalogoByIdTabla(long id);

	void addCatalogo(Catalogo catalogo);

	void updateCatalogo(Catalogo catalogo);
}
