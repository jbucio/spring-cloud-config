package com.seguritech.service;

import java.util.List;
import java.util.Optional;

import com.seguritech.model.Campo;

public interface CampoService {

	List<Campo> getAllCampo();

	Optional<Campo> getCampoById(long id);

	void addCampo(Campo campo);

	void updateCampo(Campo campo);
}
