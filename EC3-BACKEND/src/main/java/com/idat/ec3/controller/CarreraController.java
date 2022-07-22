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

import com.idat.ec3.model.Carrera;
import com.idat.ec3.service.CarreraService;

@RestController
@RequestMapping("/carrera")
public class CarreraController {

	@Autowired
	CarreraService service;
	
	@GetMapping
	public ResponseEntity<List<Carrera>> listarCarrera(){
		List<Carrera> obj = service.listarCarrera();
		return new ResponseEntity<List<Carrera>>(obj, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Carrera> crearCarrera(@RequestBody Carrera carrera){
		Carrera obj = service.crearCarrera(carrera);
		return new ResponseEntity<Carrera>(obj, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Carrera> editarCarrera(@RequestBody Carrera carrera){
		Carrera obj = service.editarCarrera(carrera);
		return new ResponseEntity<Carrera>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarCarrera(@PathVariable Long id) throws Exception{
		Carrera obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Eliminar: No se encontraron coincidencias.");
		}
		service.eliminarCarrera(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Carrera> listarPorId(@PathVariable Long id) throws Exception{
		Carrera obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Listar: No se encontraron coincidencias.");
		}
		return new ResponseEntity<Carrera>(obj, HttpStatus.OK);
	}
}