package com.formacionbdi.springboot.generic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.generic.entity.Producto;
import com.formacionbdi.springboot.generic.service.IProductoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/productos")
public class ProductoController {
	
	@Autowired
	private IProductoService productoService;

	@GetMapping("/listar")
	public List<Producto> listar(){
		return productoService.findAll();
	}
	@GetMapping("/ver/{id}")
	public Producto detalle(@PathVariable Long id){
		return productoService.findById(id);
	}
}
