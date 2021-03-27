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
import com.formacionbdi.springboot.generic.entity.Citas;
import com.formacionbdi.springboot.generic.service.IBarberoService;
import com.formacionbdi.springboot.generic.service.ICitasService;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://barber-shop-ten.vercel.app") 
@RestController
@RequestMapping("/api/appointments")
public class CitasController {
	
	@Autowired
	private ICitasService citasService;

	@GetMapping("/listar")
	public List<Citas> listar(){
		return citasService.findAllQN();
	}
	
	@GetMapping("/ver/{id}")
	public Citas detalle(@PathVariable Long id){
		return citasService.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void eliminar(@PathVariable Long id){
		citasService.deleteFindById(id);
	}
	
	@PostMapping("/add")
	public Citas add(@RequestBody Citas barbero) {
		return citasService.add(barbero);
	}
	
	@PutMapping("/update/{id}")
	public Citas update(@RequestBody Citas citas, @PathVariable Long id) {
		Citas citasUpdate = null;
		Citas citasActual = null;
		var estatus = 0;
		
		citasActual = citasService.findById(id);
		/*citasActual.setNombreCliente(citas.getNombreCliente());
		citasActual.setFechaHora(citas.getFechaHora());
		citasActual.setNumTelefono(citas.getNumTelefono());
		citasActual.setBarbero(citas.getBarbero());
		citasActual.setEmail(citas.getEmail());
		citasActual.setCalleNum(citas.getCalleNum());
		citasActual.setCp(citas.getCp());
		citasActual.setDescDomicilio(citas.getDescDomicilio());
		citasActual.setNotas(citas.getNotas());*/
		citasActual.setEstatus(estatus);
		return citasUpdate=citasService.add(citasActual);
	}
	
}
