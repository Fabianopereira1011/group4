package com.alunosunivesp.group4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alunosunivesp.group4.model.SensorModel;

public interface SensorRepository extends JpaRepository<SensorModel, Long> {

}
