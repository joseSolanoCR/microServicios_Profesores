package com.academia.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.academia.model.Profesor;
import com.academia.repository.ProfesorRepositorio;

@Service
public class ProfesoresServicio {
	@Autowired
	private ProfesorRepositorio repositorio;
	

	public List<Profesor> listarProfesor(){
		return repositorio.findAll();
		
	}
	
	public Profesor obtenerProfesorById(Integer id){
		Optional<Profesor> ProfesorOptional = repositorio.findById(id);
		
		if(ProfesorOptional.isPresent()) {
			return ProfesorOptional.get();
		} else {
			return null;
		}
		//return repositorio.findById(id).get();	
	}
	
	//public void guardarProfesor(Profesor datosProfesor) {
	//	repositorio.save(datosProfesor);
	//}
	public Profesor guardarProfesor(Profesor datosProfesor) {
		return repositorio.save(datosProfesor);
	}

	public List<Profesor> obtenerProfesorByName(String descripcion){
		return repositorio.findByNombreEquals(descripcion);
	}
	
	public void borrarProfesorById(Integer id){
		 repositorio.deleteById(id);
	}
}