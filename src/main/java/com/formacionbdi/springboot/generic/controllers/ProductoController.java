package com.formacionbdi.springboot.generic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@DeleteMapping("/delete/{id}")
	public void eliminar(@PathVariable Long id){
		productoService.deleteFindById(id);
	}
	
	@PostMapping("/add")
	public Producto add(@RequestBody Producto producto) {
		return productoService.add(producto);
	}
	
	@PutMapping("/update")
	public Producto update(@RequestBody Producto producto, @PathVariable Long id) {
		Producto productoUpdate = null;
		Producto productoActual = null;
		
		productoActual = productoService.findById(id);
		productoActual.setNombre(producto.getNombre());
		productoActual.setPrecio(producto.getPrecio());
		productoActual.setPaquete(producto.getPaquete());
		productoActual.setPrecioPack(producto.getPrecioPack());
		return productoUpdate=productoService.add(productoActual);
	}
}
