package com.alunosunivesp.group4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alunosunivesp.group4.model.SensorModel;
import com.alunosunivesp.group4.service.SensorService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v8")
public class controler {
	
	@Autowired
	SensorService sensorService;
	
	SensorModel dataSensor = new SensorModel();
	
	@GetMapping("/sensors")
	public ResponseEntity<List<SensorModel>> getSonsor() {
		return ResponseEntity.ok( sensorService.getSensors() );
	}
	
	@PostMapping("/sensor")
	public SensorModel saveSensor(@RequestBody SensorModel sensor) {
		return sensorService.saveSensor(sensor);
	}
	
	@GetMapping("/data/{id}/{whaterLevel}")
	public SensorModel getSensorByPath(@PathVariable int id, @PathVariable int whaterLevel) {
		dataSensor.setWateLevel(whaterLevel);
		dataSensor.setId(id);
		return sensorService.saveSensor(dataSensor);
	}
	
}
