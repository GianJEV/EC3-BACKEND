package com.idat.ec3.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3.model.Estudiante;
import com.idat.ec3.repository.EstudianteRepository;
import com.idat.ec3.service.EstudianteService;

@Service
public class EstudianteImpl implements EstudianteService {

	@Autowired
	EstudianteRepository estudianteDAO;
	
	@Override
	public List<Estudiante> listarEstudiante() {
		return estudianteDAO.findAll();
	}

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		return estudianteDAO.save(estudiante);
	}

	@Override
	public Estudiante EditarEstudiante(Estudiante estudiante) {
		return estudianteDAO.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Long id) {
		estudianteDAO.deleteById(id);
	}

	@Override
	public Estudiante ListarPorId(Long id) {
		return estudianteDAO.findById(id).orElse(null);
	}
}
