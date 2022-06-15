package com.alunosunivesp.group4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping()
public class sensorController {
	
	@GetMapping("/api/{id}/{whaterLevel}")
	public String getSensorByPath(@PathVariable int id, @PathVariable int whaterLevel) {
		String mensagemRetorn = "v9 retorno : -" + id +" - "+ whaterLevel ;
		return  mensagemRetorn ;
	}

}
