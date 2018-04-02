package com.seguritech.service;

import java.util.List;
import java.util.Optional;

import com.seguritech.model.Tabla;

public interface TablaService {

	List<Tabla> getAllTabla();

	Optional<Tabla> getTablaById(long id);

	void addTabla(Tabla tabla);

	void updateTabla(Tabla tabla);
}
