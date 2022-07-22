package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.model.Carrera;

public interface CarreraService {
	//LISTAR
	List<Carrera> listarCarrera();
	
	//CREAR
	Carrera crearCarrera(Carrera carrera);
	
	//EDITAR
	Carrera editarCarrera(Carrera carrera);
	
	//ELIMINAR
	void eliminarCarrera(Long id);
	
	//BUSCAR
	Carrera ListarPorId(Long id);
}
