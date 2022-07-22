package com.idat.ec3.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ec3.model.Docente;
import com.idat.ec3.repository.DocenteRepository;
import com.idat.ec3.service.DocenteService;

@Service
public class DocenteImpl implements DocenteService {
	
	@Autowired
	DocenteRepository docenteDAO;

	@Override
	public List<Docente> listarDocente() {
		return docenteDAO.findAll();
	}

	@Override
	public Docente crearDocente(Docente docente) {
		return docenteDAO.save(docente);
	}

	@Override
	public Docente editarDocente(Docente docente) {
		return docenteDAO.save(docente);
	}

	@Override
	public void eliminarDocente(Long id) {
		docenteDAO.deleteById(id);
	}

	@Override
	public Docente ListarPorId(Long id) {
		return docenteDAO.findById(id).orElse(null);
	}
}
