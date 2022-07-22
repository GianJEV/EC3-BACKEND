package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.model.Docente;

public interface DocenteService {
	//LISTAR
	List<Docente> listarDocente();
	
	//CREAR
	Docente crearDocente(Docente docente);
	
	//EDITAR
	Docente editarDocente(Docente docente);
	
	//ELIMINAR
	void eliminarDocente(Long id);
	
	//BUSCAR
	Docente ListarPorId(Long id);
}
