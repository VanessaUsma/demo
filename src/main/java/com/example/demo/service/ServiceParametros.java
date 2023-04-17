package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.parametros;

public interface ServiceParametros {
	public abstract List<parametros> listAllParametros();
	public abstract Optional<parametros> findByIdColores(String NOMBRE);
	public abstract parametros add(parametros p); 
	public abstract parametros update(parametros Parametros);
	public void delete(String NOMBRE);
	
}



