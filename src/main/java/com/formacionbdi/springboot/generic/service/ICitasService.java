package com.formacionbdi.springboot.generic.service;

import java.util.List;

import com.formacionbdi.springboot.generic.entity.Citas;


public interface ICitasService {

	public List<Citas> findAllQN();
	public Citas findById(Long id);
	public void deleteFindById(Long id);
	public Citas add(Citas citas);
}
