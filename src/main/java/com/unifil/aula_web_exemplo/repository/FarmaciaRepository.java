package com.unifil.aula_web_exemplo.repository;

import com.unifil.aula_web_exemplo.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmaciaRepository extends JpaRepository<Paciente, Long> {
}

