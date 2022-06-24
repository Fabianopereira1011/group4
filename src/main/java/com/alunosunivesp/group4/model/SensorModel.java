package com.alunosunivesp.group4.model;

import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Getter
@Setter
@Entity
public class SensorModel {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id; 
	
	private String tipo; 
	
	private int chuvaPrevisao;
	
	private int fluviometro;
	
	private String local;
	
	private boolean isAlarmOn;
	
	private int temp;
	
	private int tempMin;
	
	private int tempMax;
	
	private String date; 
	
	private int wateLevel;
	
	private String description;
	
}
