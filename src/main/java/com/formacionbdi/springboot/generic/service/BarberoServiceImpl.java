package com.formacionbdi.springboot.generic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.generic.dao.BarberoDao;
import com.formacionbdi.springboot.generic.entity.Barbero;


@Service
public class BarberoServiceImpl implements IBarberoService{
	
	@Autowired
	private BarberoDao barberoDao;

	@Override
	@Transactional(readOnly = true) 
	public List<Barbero> findAll() {
		return (List<Barbero>) barberoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Barbero findById(Long id) {
		return barberoDao.findById(id).orElse(null); // orElse: por si no hay dato le asigna el null
	}

	@Override
	@Transactional
	public void deleteFindById(Long id) {
		barberoDao.deleteById(id);
	}

	@Override
	@Transactional
	public Barbero add(Barbero barbero) {
		return barberoDao.save(barbero);
	}


}
