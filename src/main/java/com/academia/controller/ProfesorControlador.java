package com.academia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.academia.model.Profesor;
import com.academia.service.ProfesoresServicio;

@RestController
public class ProfesorControlador {
	
	@Autowired
	private ProfesoresServicio servicio;

	@GetMapping("/profesor")
	public List<Profesor> listarProfesor(){
		return servicio.listarProfesor();
	}
	
	@GetMapping("/profesor/{id}")
	public ResponseEntity<Profesor> obtenerProfesorById(@PathVariable Integer id){
		try {
			Profesor ProfesorDato = servicio.obtenerProfesorById(id);
			if (ProfesorDato !=null) {
			return new ResponseEntity<>(ProfesorDato, HttpStatus.OK);
			} else {}return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	
	//@PostMapping("/profesor")
	//public void guardarProfesor(@RequestBody Profesor datosProfesor){
	//	 servicio.guardarProfesor(datosProfesor);
	//}
	
	@PostMapping("/profesor")
	public ResponseEntity<String> guardarProfesor(@RequestBody Profesor datosProfesor){ 
		try {
			 Profesor ProfesorGuardado = servicio.guardarProfesor(datosProfesor);
			 Integer idnuevo = ProfesorGuardado.getId();
			 return new ResponseEntity<>("El Profesor fue almacenado " + idnuevo, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error al crear Profesor " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/profesor/{id}")
	public ResponseEntity<Profesor> borrarProfesorById(@PathVariable Integer id){
		try {
			Profesor ProfesorExiste = servicio.obtenerProfesorById(id);
			if (ProfesorExiste != null) {
				servicio.borrarProfesorById(id);
				return new ResponseEntity<>(ProfesorExiste, HttpStatus.OK);
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		//servicio.borrarProfesorById(id);
	}


	@GetMapping("/profesorByName/{nombre}")
	public ResponseEntity<Profesor> obtenerProfesorById(@PathVariable String nombre){
		try {
			List<Profesor> ProfesorDato = servicio.obtenerProfesorByName(nombre);
			if (!ProfesorDato.isEmpty()) {
			return new ResponseEntity<>(ProfesorDato.get(0), HttpStatus.OK);
			} else {}return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/profesor/{id}")
	public ResponseEntity<?> actualizarProfesor(@RequestBody Profesor datosProfesor, @PathVariable Integer id){
		try {
			Profesor ProfesorExiste = servicio.obtenerProfesorById(id);
			if (ProfesorExiste != null) {
				datosProfesor.setId(id);
				Profesor ProfesorGuardado = servicio.guardarProfesor(datosProfesor);
				return new ResponseEntity<>(ProfesorGuardado, HttpStatus.OK);
				}else {
					return new ResponseEntity<>("Profesor no existe " + id, HttpStatus.NOT_FOUND);
				}
		} catch (Exception e) {
			return new ResponseEntity<>("Error al actualizar " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}