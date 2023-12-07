package com.academia.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cedula;
	private String correoelectronico;
	private String telefono;
	private String telefonocelular;
	private Date fechanacimiento;
	private String sexo;
	private String direccion;
	private String nombre;
	private String apellidopaterno;
	private String apellidomaterno;
	private String nacionalidad;
	private String usuario;
	private Integer idcarreras;
	
	public Profesor() {
		
	}

	public Profesor(Integer id, String cedula, String correoelectronico, String telefono, String telefonocelular,
			Date fechanacimiento, String sexo, String direccion, String nombre, String apellidopaterno,
			String apellidomaterno, String nacionalidad, String usuario, Integer idcarreras) {
		super();
		this.id = id;
		this.cedula = cedula;
		this.correoelectronico = correoelectronico;
		this.telefono = telefono;
		this.telefonocelular = telefonocelular;
		this.fechanacimiento = fechanacimiento;
		this.sexo = sexo;
		this.direccion = direccion;
		this.nombre = nombre;
		this.apellidopaterno = apellidopaterno;
		this.apellidomaterno = apellidomaterno;
		this.nacionalidad = nacionalidad;
		this.usuario = usuario;
		this.idcarreras = idcarreras;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCorreoelectronico() {
		return correoelectronico;
	}

	public void setCorreoelectronico(String correoelectronico) {
		this.correoelectronico = correoelectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTelefonocelular() {
		return telefonocelular;
	}

	public void setTelefonocelular(String telefonocelular) {
		this.telefonocelular = telefonocelular;
	}

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidopaterno() {
		return apellidopaterno;
	}

	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}

	public String getApellidomaterno() {
		return apellidomaterno;
	}

	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public Integer getIdcarreras() {
		return idcarreras;
	}

	public void setIdcarreras(Integer idcarreras) {
		this.idcarreras = idcarreras;
	}
		
}