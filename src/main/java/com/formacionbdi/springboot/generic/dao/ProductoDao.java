package com.formacionbdi.springboot.generic.dao;


import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.generic.entity.Producto;


public interface ProductoDao extends CrudRepository<Producto, Long>{

}
