package com.example.demo.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Estudiante {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String especialidad;
	private String grado;
	
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getGrado() {
		return grado;
	}
	public void setGrado(String grado) {
		this.grado = grado;
	}
	
	
	

}
