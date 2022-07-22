package com.idat.ec3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.ec3.model.Estudiante;

//Como si fuera un DAO pero más chevere
public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{

}
