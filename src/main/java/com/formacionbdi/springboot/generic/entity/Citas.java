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
@Table(name = "citas") //nombre de la tabla en la BD
public class Citas implements Serializable {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica auto incrementable
	private Long id;
	
	@Column(name="nombre_cliente")
	private String nombreCliente;
	@Column(name="fecha_hora")
	private String fechaHora;
	@Column(name="num_telefono")
	private String numTelefono;
	private String barbero;
	private String email;
	@Column(name="calle_num")
	private String calleNum;
	private String cp;
	@Column(name="desc_domicilio")
	private String descDomicilio;
	private String notas;
	private int estatus;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(String fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getNumTelefono() {
		return numTelefono;
	}

	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}

	public String getBarbero() {
		return barbero;
	}

	public void setBarbero(String barbero) {
		this.barbero = barbero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCalleNum() {
		return calleNum;
	}

	public void setCalleNum(String calleNum) {
		this.calleNum = calleNum;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDescDomicilio() {
		return descDomicilio;
	}

	public void setDescDomicilio(String descDomicilio) {
		this.descDomicilio = descDomicilio;
	}

	public String getNotas() {
		return notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
	}



	public int getEstatus() {
		return estatus;
	}

	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}



	private static final long serialVersionUID = 6058469176942860L;

}
