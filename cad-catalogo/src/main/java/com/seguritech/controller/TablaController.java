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

import com.seguritech.model.Tabla;
import com.seguritech.service.TablaService;

@RestController
public class TablaController {

	@Autowired
	private TablaService tablaServiceImpl;

	@RequestMapping(path="/tabla",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tabla>> addTabla(@RequestBody Tabla tabla) {
		tablaServiceImpl.addTabla(tabla);

		return new ResponseEntity<List<Tabla>>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/tabla",method=RequestMethod.PUT,produces=MediaType.APPLICATION_JSON_VALUE,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tabla>> updateTabla(@RequestBody Tabla tabla) {
		tablaServiceImpl.updateTabla(tabla);

		return new ResponseEntity<List<Tabla>>(HttpStatus.OK);
	}
	
	@RequestMapping(path="/tabla",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Tabla>> getAllTabla() {
		List<Tabla> list = tablaServiceImpl.getAllTabla();

		if (list.isEmpty()) {
			return new ResponseEntity<List<Tabla>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Tabla>>(list, HttpStatus.OK);
	}
	
	@RequestMapping(path="/Tabla/{id}",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Tabla> getTablaById(@PathVariable("id") long id) {
		Tabla tabla = tablaServiceImpl.getTablaById(id).get();

		if (tabla == null) {
			return new ResponseEntity<Tabla>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Tabla>(tabla, HttpStatus.OK);
	}
	

}
