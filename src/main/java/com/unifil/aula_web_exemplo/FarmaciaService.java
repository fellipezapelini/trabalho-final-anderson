package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Paciente;
import com.unifil.aula_web_exemplo.repository.FarmaciaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FarmaciaService {

    private final FarmaciaRepository farmaciaRepository;

    public FarmaciaService(FarmaciaRepository farmaciaRepository) {
        this.farmaciaRepository = farmaciaRepository;
    }

    public List<Paciente> findAll() {
        return farmaciaRepository.findAll();
    }
}
