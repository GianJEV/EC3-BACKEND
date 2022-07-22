package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.model.Sede;

public interface SedeService {
	//LISTAR
	List<Sede> listarSede();
	
	//CREAR
	Sede crearSede(Sede sede);
	
	//EDITAR
	Sede editarSede(Sede sede);
	
	//ELIMINAR
	void eliminarSede(Long id);
	
	//BUSCAR
	Sede ListarPorId(Long id);
}
