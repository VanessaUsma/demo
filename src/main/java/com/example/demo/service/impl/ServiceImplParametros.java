package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ParametrosDao;
import com.example.demo.model.parametros;
import com.example.demo.service.ServiceParametros;

@Service("parametrosServiceImpl")
@Transactional

public class ServiceImplParametros implements ServiceParametros {
	
	@Autowired
	@Qualifier("ParametrosRepository")
	
	private ParametrosDao parametrosDao; 
	
	public List<parametros> listAllParametros(){
		return (List<parametros>) parametrosDao.findAll(); 
	}
	@Override
	public Optional<parametros> findByIdColores(String NOMBRE) {
		return parametrosDao.findById(NOMBRE); 
	} 
	public parametros add(parametros p) {
		return  parametrosDao.save(p);
	}
	public parametros update(parametros Parametros) {
		return  parametrosDao.save(Parametros);
	}
	@Override
	public void delete(String NOMBRE) {
		parametrosDao.deleteById(NOMBRE);
	}
	

	
}
