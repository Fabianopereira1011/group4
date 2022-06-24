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
	
	@GetMapping("/sensorAgua/{whaterLevel}")
	public SensorModel getSensorAgua(@PathVariable int whaterLevel) {
		dataSensor.setId("sensorAgua");
		dataSensor.setWateLevel(whaterLevel);
		return sensorService.saveSensor(dataSensor);
	}
	
	@GetMapping("/fluviometro/{nivel}")
	public SensorModel getSensorFluviometro(@PathVariable int nivel) {
		dataSensor.setId("fluviometro");
		dataSensor.setTipo("fluviometro");
		dataSensor.setFluviometro(nivel);
		return sensorService.saveSensor(dataSensor);
	}
	
	@GetMapping("/chuva/{nivel}")
	public SensorModel getChuva(@PathVariable int nivel) {
		dataSensor.setId("previsao_inteligente");
		dataSensor.setChuvaPrevisao(nivel);
		return sensorService.saveSensor(dataSensor);
	}
	
}
