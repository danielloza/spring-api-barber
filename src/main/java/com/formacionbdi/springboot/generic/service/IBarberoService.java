package com.formacionbdi.springboot.generic.service;

import java.util.List;

import com.formacionbdi.springboot.generic.entity.Barbero;


public interface IBarberoService {

	public List<Barbero> findAll();
	public Barbero findById(Long id);
	public void deleteFindById(Long id);
	public Barbero add(Barbero barbero);
}
