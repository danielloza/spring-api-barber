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
	
	@Column(name = "create_at") //aplica cuando el nombre de la base es diferente al del modelo
	@Temporal(TemporalType.DATE) //especifica en que formato se guarda la fecha
	private Date createAt;

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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -279196011726236174L;

	
	
}
