package com.idat.ec3.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3.model.Sede;
import com.idat.ec3.repository.SedeRepository;
import com.idat.ec3.service.SedeService;

@Service
public class SedeImpl implements SedeService{
	
	@Autowired
	SedeRepository sedeDAO;

	@Override
	public List<Sede> listarSede() {
		return sedeDAO.findAll();
	}

	@Override
	public Sede crearSede(Sede sede) {
		return sedeDAO.save(sede);
	}

	@Override
	public Sede editarSede(Sede sede) {
		return sedeDAO.save(sede);
	}

	@Override
	public void eliminarSede(Long id) {
		sedeDAO.deleteById(id);
	}

	@Override
	public Sede ListarPorId(Long id) {
		return sedeDAO.findById(id).orElse(null);
	}
}
