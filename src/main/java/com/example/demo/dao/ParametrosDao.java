package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.parametros;

@Repository("ParametrosRepository")

public interface ParametrosDao extends CrudRepository<parametros,String> {

}

