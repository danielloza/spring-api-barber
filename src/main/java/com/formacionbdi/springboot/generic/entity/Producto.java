package com.formacionbdi.springboot.generic.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "productos") //nombre de la tabla en la BD
public class Producto implements Serializable {


	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica auto incrementable
	private Long id;
	
	private String nombre;
	private Double precio;
	private String paquete;
	
	@Column(name="precio_pack")
	private Double precioPack;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getPaquete() {
		return paquete;
	}

	public void setPaquete(String paquete) {
		this.paquete = paquete;
	}

	public Double getPrecioPack() {
		return precioPack;
	}

	public void setPrecioPack(Double precioPack) {
		this.precioPack = precioPack;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -279196011726236174L;

	
	
}
