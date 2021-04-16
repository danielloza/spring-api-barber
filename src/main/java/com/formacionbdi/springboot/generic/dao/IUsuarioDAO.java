package com.formacionbdi.springboot.generic.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.springboot.generic.entity.Usuario;


public interface IUsuarioDAO extends CrudRepository<Usuario, Long>{
	
	// Consulta donde me traera el usuario buscando por username
	public Usuario findByUsername(String username);
	
	// Consulta donde me traera el usuario buscando por username, 
	// utilizando la notacion @Query
	@Query("Select u From Usuario u WHERE u.username = ?1")
	public Usuario findByUsername2(String username);
	
	@Query("Select COUNT(u) From Usuario u WHERE u.username = ?1 and u.password = ?2 and u.enabled = true")
	public Integer findUserPassword(String user, String pass);
	
	/*
	@Query("Select u From Usuario u WHERE u.username = ?1 and u.password = ?2 and u.enabled = true")
	public Usuario findUserPassword(String user, String pass);*/
	
}
