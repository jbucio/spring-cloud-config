package com.seguritech.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seguritech.model.Campo;
import com.seguritech.repository.CampoRepository;

@Service
public class CampoServiceImpl implements CampoService {
	
	@Autowired
	private CampoRepository campoRepository;

	@Override
	public List<Campo> getAllCampo() {
		return campoRepository.findAll();
	}

	@Override
	public Optional<Campo> getCampoById(long id) {
		return campoRepository.findById(id);
	}

	@Override
	public void addCampo(Campo campo) {
		campoRepository.save(campo);
	}

	@Override
	public void updateCampo(Campo campo) {
		campoRepository.save(campo);
	}

}
