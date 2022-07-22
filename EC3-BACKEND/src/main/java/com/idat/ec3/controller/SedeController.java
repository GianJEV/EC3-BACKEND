package com.idat.ec3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.idat.ec3.model.Sede;
import com.idat.ec3.service.SedeService;

@RestController
@RequestMapping("/sede")
public class SedeController {

	@Autowired
	SedeService service;
	
	@GetMapping
	public ResponseEntity<List<Sede>> listarSede(){
		List<Sede> obj = service.listarSede();
		return new ResponseEntity<List<Sede>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Sede> crearSede(@RequestBody Sede sede){
		Sede obj = service.crearSede(sede);
		return new ResponseEntity<Sede>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Sede> editarSede(@RequestBody Sede sede){
		Sede obj = service.editarSede(sede);
		return new ResponseEntity<Sede>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarSede(@PathVariable Long id) throws Exception{
		Sede obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Eliminar: No se encontraron coincidencias.");
		}
		service.eliminarSede(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Sede> listarPorId(@PathVariable Long id) throws Exception{
		Sede obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Listar: No se encontraron coincidencias.");
		}
		return new ResponseEntity<Sede>(obj, HttpStatus.OK);
	}
	
	
}
