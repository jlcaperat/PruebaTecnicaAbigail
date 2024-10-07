package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Estudiante;
import com.example.demo.repository.EstudianteRepositorio;


@Service
public class EstudianteServiceImpl implements IServiceEstudiante{
	
	@Autowired
	private EstudianteRepositorio repo;
	

	@Override
	public List<Estudiante> getAll() {	
		return repo.findAll();
	}

	@Override
	public Estudiante getId(Integer id) {		
		return repo.findById(id).get();
	}

	@Override
	public Estudiante update(Estudiante estudiante) {
		Estudiante estudianteEntity =new Estudiante();
		
		estudianteEntity= repo.findById(estudiante.getId()).get();
		estudianteEntity.setNombre(estudiante.getNombre());
		estudianteEntity.setGrado(estudiante.getGrado());
		estudianteEntity.setEspecialidad(estudiante.getEspecialidad());		
		return repo.save(estudianteEntity);
	}

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {		
		return repo.save(estudiante);
	}

	@Override
	public void eliminarEstudiante(Integer id) {
		repo.deleteById(id);		
	}
	


}
