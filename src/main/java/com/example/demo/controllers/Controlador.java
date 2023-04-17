package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.parametros;
import com.example.demo.service.impl.ServiceImplParametros;

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
@RestController
@RequestMapping("/parametros")

public class Controlador {
	
	@Autowired
	@Qualifier("parametrosServiceImpl")
	

	private ServiceImplParametros parametrosService;
	
	@GetMapping
	public List<parametros> listParametros(){
		return parametrosService.listAllParametros();
	}
	@PostMapping 
	public parametros agregar(@RequestBody parametros p) {
		return parametrosService.add(p);
	}
	@GetMapping(path= {"/{NOMBRE}"})
	public Optional<parametros> getColores(@PathVariable("NOMBRE") String NOMBRE){
		return parametrosService.findByIdColores(NOMBRE);
	}
	@PutMapping(path= {"/{NOMBRE}"})
	public parametros updateColores(@RequestBody parametros Parametros,@PathVariable("NOMBRE") String NOMBRE){
		Parametros.setNOMBRE(NOMBRE);
		return parametrosService.update(Parametros);
	}
	@DeleteMapping(path= {"/{NOMBRE}"})
	public void deleteColores(@PathVariable("NOMBRE") String NOMBRE){
		 parametrosService.delete(NOMBRE);
	}
	
	@GetMapping("holaMundo")
	public String holaMundo() {
		return "Hola";
	}

}
