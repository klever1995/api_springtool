package com.ucentral.api.apirest3.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ucentral.api.apirest3.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
