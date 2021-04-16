package com.formacionbdi.springboot.generic.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacionbdi.springboot.generic.dao.IUsuarioDAO;
import com.formacionbdi.springboot.generic.entity.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService{

	private Logger logger = LoggerFactory.getLogger(UsuarioServiceImpl.class);
	
	@Autowired
	private IUsuarioDAO usuarioDAO;
	
	
	@Override
	public Usuario findByUsername(String username) {
		return usuarioDAO.findByUsername(username);
	}

	@Override
	public Usuario findUserPassword(String user, String pass) {
		
		return usuarioDAO.findUserPassword(user,pass);
	}

}
