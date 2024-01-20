package com.ucentral.api.apirest3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ucentral.api.apirest3.model.Persona;

@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class PersonaController {
	
	@Autowired
	private ServicePersona servicePersona;
	
	@PostMapping("api/persona")
	public Persona guardarPersona(@RequestBody Persona persona) {
		servicePersona.guardar(persona);
		return persona;
	}
	
	@GetMapping("api/persona")
	public List<Persona>obtener(){
		return servicePersona.obtenerTodos();
	}
	
	@GetMapping("api/persona/{id}")
	public Persona obteneruno(@PathVariable("id")Integer id) {
		return servicePersona.obtenerPersona(id);
	}
	
	@PutMapping("api/persona")
	public void actualizarPersona(@RequestBody Persona persona) {
		servicePersona.actualizar(persona);
	}
	
	@DeleteMapping("api/persona/{id}")
	public void eliminarPersona(@PathVariable("id")Integer id) {
		servicePersona.eliminar(id);
	}

}
