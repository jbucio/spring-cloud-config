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

import com.seguritech.model.Catalogo;
import com.seguritech.service.CatalogoService;

@RestController
public class CatalogoController {

	@Autowired
	private CatalogoService catalogoServiceImpl;

	@RequestMapping(path="/catalogo",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Catalogo>> addCatalogo(@RequestBody Catalogo catalogo) {
		catalogoServiceImpl.addCatalogo(catalogo);

		return new ResponseEntity<List<Catalogo>>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/catalogo",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Catalogo>> updateCatalogo(@RequestBody Catalogo catalogo) {
		catalogoServiceImpl.updateCatalogo(catalogo);

		return new ResponseEntity<List<Catalogo>>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/catalogo",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Catalogo>> getAllCatalogo() {
		List<Catalogo> list = catalogoServiceImpl.getAllCatalogo();

		if (list.isEmpty()) {
			return new ResponseEntity<List<Catalogo>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Catalogo>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(path="/catalogo/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Catalogo> getCatalogoById(@PathVariable("id") long id) {
		Catalogo catalogo = catalogoServiceImpl.getCatalogoById(id).get();

		if (catalogo == null) {
			return new ResponseEntity<Catalogo>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Catalogo>(catalogo, HttpStatus.OK);
	}
	
	@RequestMapping(path="/catalogo/tabla/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Catalogo>> getCatalogoByIdTabla(@PathVariable("id") long id) {
		List<Catalogo> list = catalogoServiceImpl.getCatalogoByIdTabla(id);

		if (list.isEmpty()) {
			return new ResponseEntity<List<Catalogo>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Catalogo>>(list, HttpStatus.OK);
	}

}
