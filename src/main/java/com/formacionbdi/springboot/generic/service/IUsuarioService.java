package com.formacionbdi.springboot.generic.service;

import com.formacionbdi.springboot.generic.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
	
	public Integer findUserPassword(String user, String pass);
}
