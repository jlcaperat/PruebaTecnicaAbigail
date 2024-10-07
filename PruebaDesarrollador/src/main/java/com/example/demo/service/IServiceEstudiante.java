package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Estudiante;

public interface IServiceEstudiante {
	
	
	public List<Estudiante> getAll();
	public Estudiante getId(Integer id);
	public Estudiante update(Estudiante estudiante);
	public Estudiante crearEstudiante(Estudiante estudiante);
    public void eliminarEstudiante(Integer id);
	

}
