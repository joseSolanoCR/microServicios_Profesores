package com.academia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.academia.model.Profesor;

public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer>{
	List<Profesor> findByNombreEquals(String nombre);
}
