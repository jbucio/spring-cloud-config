package com.seguritech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguritech.model.Catalogo;
import com.seguritech.repository.CatalogoRepository;

@Service
public class CatalogoServiceImpl implements CatalogoService {
	
	@Autowired
	private CatalogoRepository catalogoRepository;

	@Override
	public List<Catalogo> getAllCatalogo() {
		return catalogoRepository.findAll();
	}

	@Override
	public Optional<Catalogo> getCatalogoById(long id) {
		return catalogoRepository.findById(id);
	}

	@Override
	public List<Catalogo> getCatalogoByIdTabla(long id) {
		return catalogoRepository.findByIdTabla(id);
	}

	@Override
	public void addCatalogo(Catalogo catalogo) {
		catalogoRepository.save(catalogo);
	}

	@Override
	public void updateCatalogo(Catalogo catalogo) {
		catalogoRepository.save(catalogo);
	}

}
