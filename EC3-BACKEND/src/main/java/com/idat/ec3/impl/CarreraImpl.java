package com.idat.ec3.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3.model.Carrera;
import com.idat.ec3.repository.CarreraRepository;
import com.idat.ec3.service.CarreraService;

@Service
public class CarreraImpl implements CarreraService{

	@Autowired
	CarreraRepository carreraDAO;

	@Override
	public List<Carrera> listarCarrera() {
		return carreraDAO.findAll();
	}

	@Override
	public Carrera crearCarrera(Carrera carrera) {
		return carreraDAO.save(carrera);
	}

	@Override
	public Carrera editarCarrera(Carrera carrera) {
		return carreraDAO.save(carrera);
	}

	@Override
	public void eliminarCarrera(Long id) {
		carreraDAO.deleteById(id);
	}

	@Override
	public Carrera ListarPorId(Long id) {
		return carreraDAO.findById(id).orElse(null);
	}
}
