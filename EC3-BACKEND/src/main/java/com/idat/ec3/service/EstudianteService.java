package com.idat.ec3.service;

import java.util.List;

import com.idat.ec3.model.Estudiante;

public interface EstudianteService {
	//LISTAR
	List<Estudiante> listarEstudiante();
	
	//CREAR
	Estudiante crearEstudiante(Estudiante estudiante);
	
	//EDITAR
	Estudiante EditarEstudiante(Estudiante estudiante);
	
	//ELIMINAR
	void eliminarEstudiante(Long id);
	
	//BUSCAR
	Estudiante ListarPorId(Long id);
}
