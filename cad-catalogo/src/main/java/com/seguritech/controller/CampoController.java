package com.seguritech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.seguritech.model.Campo;
import com.seguritech.service.CampoService;

@RestController
public class CampoController {

	@Autowired
	private CampoService campoServiceImpl;

	@RequestMapping(path="/campo",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Campo>> addCampo(@RequestBody Campo campo) {
		campoServiceImpl.addCampo(campo);

		return new ResponseEntity<List<Campo>>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/campo",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Campo>> updateCampo(@RequestBody Campo campo) {
		campoServiceImpl.updateCampo(campo);

		return new ResponseEntity<List<Campo>>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/campo",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Campo>> getAllCampo() {
		List<Campo> list = campoServiceImpl.getAllCampo();

		if (list.isEmpty()) {
			return new ResponseEntity<List<Campo>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Campo>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(path="/campo/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Campo> getCampoById(@PathVariable("id") long id) {
		Campo campo = campoServiceImpl.getCampoById(id).get();

		if (campo == null) {
			return new ResponseEntity<Campo>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Campo>(campo, HttpStatus.OK);
	}
	

}
