package com.seguritech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguritech.model.Tabla;
import com.seguritech.repository.TablaRepository;

@Service
public class TablaServiceImpl implements TablaService {
	
	@Autowired
	private TablaRepository TablaRepository;

	@Override
	public List<Tabla> getAllTabla() {
		return TablaRepository.findAll();
	}

	@Override
	public Optional<Tabla> getTablaById(long id) {
		return TablaRepository.findById(id);
	}

	@Override
	public void addTabla(Tabla tabla) {
		TablaRepository.save(tabla);
	}

	@Override
	public void updateTabla(Tabla tabla) {
		TablaRepository.save(tabla);
	}

}
