package com.example.demo.controller;

import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Estudiante;
import com.example.demo.service.IServiceEstudiante;

@RestController
@RequestMapping(value = "/v1")
public class EstudianteController {

	@Autowired
	private IServiceEstudiante service;

	@GetMapping("/estudiante")
	public ResponseEntity<List<Estudiante>> getAll() {
		List<Estudiante> lista = new ArrayList<Estudiante>();
		lista = service.getAll();
		return new ResponseEntity<List<Estudiante>>(lista, HttpStatus.OK);
	}

	@GetMapping("/estudiante/{id}")
	public ResponseEntity<Estudiante> getId(@PathVariable Integer id) {
		Estudiante estudiante = new Estudiante();
		estudiante = service.getId(id);
		return new ResponseEntity<Estudiante>(estudiante, HttpStatus.OK);
	}

	@PostMapping("/estudiante")
	public ResponseEntity<Estudiante> crearEstudiante(@RequestBody Estudiante estudiante) {
		Estudiante estudianteEntity = new Estudiante();
		estudianteEntity = service.crearEstudiante(estudiante);
		return new ResponseEntity<Estudiante>(estudianteEntity, HttpStatus.OK);
	}

	@DeleteMapping("/estudiante/{id}")
	public ResponseEntity<String> eliminarEstudiante(@PathVariable Integer id) {

		service.eliminarEstudiante(id);
		return new ResponseEntity<String>("eliminado Correctamente", HttpStatus.OK);
	}

	@PutMapping("/estudiante/")
	public ResponseEntity<Estudiante> actualizarEstudiante(@RequestBody Estudiante estudiante) {
		Estudiante estudianteEntity = new Estudiante();
		estudianteEntity = service.crearEstudiante(estudiante);
		return new ResponseEntity<Estudiante>(estudianteEntity, HttpStatus.OK);
	}

}
