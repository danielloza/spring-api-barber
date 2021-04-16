package com.formacionbdi.springboot.generic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.formacionbdi.springboot.generic.entity.Usuario;
import com.formacionbdi.springboot.generic.service.IUsuarioService;

@CrossOrigin(origins = {"https://barber-shop-ten.vercel.app", "*"}) 
@RestController
@RequestMapping("/api/login")
public class LoginController {
	
	@Autowired
	private IUsuarioService iuService;
	
	@GetMapping("/ver/{user}/{pass}")
	public Usuario detalle(@PathVariable String user,@PathVariable  String pass){
		return iuService.findUserPassword(user,pass);
	}

}
