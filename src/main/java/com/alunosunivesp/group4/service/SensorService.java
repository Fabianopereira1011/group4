package com.alunosunivesp.group4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alunosunivesp.group4.repository.SensorRepository;
import com.alunosunivesp.group4.model.SensorModel;

@Service
public class SensorService {
	
	@Autowired
	SensorRepository sensores;
	
	public List< SensorModel > getSensors(){
		return sensores.findAll();
	}
	
	public SensorModel saveSensor(SensorModel sensor){
		return sensores.save(sensor);
	}

}
