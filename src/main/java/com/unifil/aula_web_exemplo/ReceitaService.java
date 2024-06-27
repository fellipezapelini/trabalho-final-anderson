package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Paciente;
import com.unifil.aula_web_exemplo.repository.ReceitaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReceitaService {

    private final ReceitaRepository receitaRepository;

    public ReceitaService(ReceitaRepository receitaRepository) {
        this.receitaRepository = receitaRepository;
    }

    public List<Paciente> findAll() {
        return receitaRepository.findAll();
    }
}
