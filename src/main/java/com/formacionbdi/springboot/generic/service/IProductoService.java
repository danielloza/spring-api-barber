package com.formacionbdi.springboot.generic.service;

import java.util.List;

import com.formacionbdi.springboot.generic.entity.Producto;


public interface IProductoService {

	public List<Producto> findAll();
	public Producto findById(Long id);
	public void deleteFindById(Long id);
	public Producto add(Producto producto);
}
