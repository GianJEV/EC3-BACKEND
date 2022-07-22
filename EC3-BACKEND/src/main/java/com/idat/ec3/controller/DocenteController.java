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

import com.idat.ec3.model.Docente;
import com.idat.ec3.service.DocenteService;

@RestController
@RequestMapping("/docente")
public class DocenteController {

	@Autowired
	private DocenteService service;
	
	@GetMapping
	public ResponseEntity<List<Docente>> listarDocente(){
		List<Docente> obj = service.listarDocente();
		return new ResponseEntity<List<Docente>>(obj, HttpStatus.OK);
	}
	
	//SE UTILIZA EL URI PARA QUE NO TE DEVUELVA UN JSON DE RESPUESTA AL CREAR
	@PostMapping
	public ResponseEntity<Void> crearDocente(@RequestBody Docente docente){
		Docente obj = service.crearDocente(docente);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdDocente()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@PutMapping
	public ResponseEntity<Docente> editarDocente(@RequestBody Docente docente){
		Docente obj = service.editarDocente(docente);
		return new ResponseEntity<Docente>(obj, HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminarDocente(@PathVariable Long id) throws Exception{
		Docente obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Eliminar: No se encontraron coincidencias.");
		}
		service.eliminarDocente(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Docente> listarPorId(@PathVariable Long id) throws Exception{
		Docente obj = service.ListarPorId(id);
		if (obj == null) {
			throw new Exception("Listar: No se encontraron coincidencias.");
		}
		return new ResponseEntity<Docente>(obj, HttpStatus.OK);
	}
	
}
