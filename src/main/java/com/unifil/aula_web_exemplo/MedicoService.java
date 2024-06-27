package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Paciente;
import com.unifil.aula_web_exemplo.repository.MedicoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoService {

    private final MedicoRepository medicoRepository;

    public MedicoService(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    public List<Paciente> findAll() {
        return medicoRepository.findAll();
    }
}
