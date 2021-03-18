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

import com.formacionbdi.springboot.generic.entity.Barbero;
import com.formacionbdi.springboot.generic.service.IBarberoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/barberos")
public class BarberoController {
	
	@Autowired
	private IBarberoService barberoService;

	@GetMapping("/listar")
	public List<Barbero> listar(){
		return barberoService.findAll();
	}
	
	@GetMapping("/ver/{id}")
	public Barbero detalle(@PathVariable Long id){
		return barberoService.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void eliminar(@PathVariable Long id){
		barberoService.deleteFindById(id);
	}
	
	@PostMapping("/add")
	public Barbero add(@RequestBody Barbero barbero) {
		return barberoService.add(barbero);
	}
	
	@PutMapping("/update/{id}")
	public Barbero update(@RequestBody Barbero barbero, @PathVariable Long id) {
		Barbero barberoUpdate = null;
		Barbero barberoActual = null;
		
		barberoActual = barberoService.findById(id);
		barberoActual.setNombre(barbero.getNombre());
		barberoActual.setPuesto(barbero.getPuesto());
		barberoActual.setEspecialidad(barbero.getEspecialidad());
		return barberoUpdate=barberoService.add(barberoActual);
	}
}
