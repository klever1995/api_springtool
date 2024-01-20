package com.ucentral.api.apirest3.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="persona")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String nombre;
private String apellido;
private Integer edad;

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

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public Integer getEdad() {
	return edad;
}

public void setEdad(Integer edad) {
	this.edad = edad;
}

public Persona() {
	
}

@Override
public String toString() {
	return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
}

}
