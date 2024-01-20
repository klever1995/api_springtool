package com.ucentral.api.apirest3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucentral.api.apirest3.model.Persona;

@Service
public class ServicePersona {

	@Autowired
	private PersonaRepository personaRepository;
	
	public void guardar(Persona persona) {
		personaRepository.save(persona);
	}
	
	public List<Persona>obtenerTodos(){
		return personaRepository.findAll();
	}
	
	public Persona obtenerPersona(Integer Id) {
		return personaRepository.getReferenceById(Id);
	}
	
	public void actualizar(Persona persona) {
		personaRepository.save(persona);
	}
	
	public void eliminar(Integer Id) {
		personaRepository.deleteById(Id);
	}
}
