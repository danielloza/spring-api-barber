package com.formacionbdi.springboot.generic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.generic.dao.CitasDao;
import com.formacionbdi.springboot.generic.entity.Citas;


@Service
public class CitasServiceImpl implements ICitasService{
	
	@Autowired
	private CitasDao citasDao;

	@Override
	@Transactional(readOnly = true) 
	public List<Citas> findAllQN() {
		return (List<Citas>) citasDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Citas findById(Long id) {
		return citasDao.findById(id).orElse(null); // orElse: por si no hay dato le asigna el null
	}

	@Override
	@Transactional
	public void deleteFindById(Long id) {
		citasDao.deleteById(id);
	}

	@Override
	@Transactional
	public Citas add(Citas citas) {
		return citasDao.save(citas);
	}



}
