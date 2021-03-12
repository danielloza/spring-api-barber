package com.formacionbdi.springboot.generic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.generic.dao.ProductoDao;
import com.formacionbdi.springboot.generic.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService{
	
	@Autowired
	private ProductoDao productoDao;

	@Override
	@Transactional(readOnly = true) 
	public List<Producto> findAll() {
		return (List<Producto>) productoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		return productoDao.findById(id).orElse(null); // orElse: por si no hay dato le asigna el null
	}

	@Override
	@Transactional(readOnly = true)
	public void deleteFindById(Long id) {
		productoDao.deleteById(id);
	}

	@Override
	public Producto add(Producto producto) {
		return productoDao.save(producto);
	}


}
