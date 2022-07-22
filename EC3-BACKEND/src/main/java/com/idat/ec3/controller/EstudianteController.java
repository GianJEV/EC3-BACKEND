package com.idat.ec3.controller;

import java.net.URI;
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
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.idat.ec3.model.Estudiante;
import com.idat.ec3.service.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@GetMapping
	public ResponseEntity<List<Estudiante>> listarEstudiante(){
		List<Estudiante> obj = service.listarEstudiante();
		return new ResponseEntity<List<Estudiante>>(obj, HttpStatus.OK);
	}
	
	//SE UTILIZA EL URI PARA QUE NO TE DEVUELVA UN JSON DE RESPUESTA AL CREAR
	@PostMapping
	public ResponseEntity<Void> crearEstudiante(@RequestBody Estudiante estudiante){
		Estudiante obj = service.crearEstudiante(estudiante);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdEstudiante()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Estudiante> editarEstudiante(@RequestBody Estudiante estudiante){
		Estudiante obj = service.EditarEstudiante(estudiante);
		return new ResponseEntity<Estudiante>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarEstudiante(@PathVariable Long id) throws Exception{
		Estudiante obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Eliminar: No se encontraron coincidencias.");
		}
		service.eliminarEstudiante(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Estudiante> listarPorId(@PathVariable Long id) throws Exception{
		Estudiante obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Listar: No se encontraron coincidencias.");
		}
		return new ResponseEntity<Estudiante>(obj, HttpStatus.OK);
	}
	
}
