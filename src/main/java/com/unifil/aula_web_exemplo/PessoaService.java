package com.unifil.aula_web_exemplo;

import com.unifil.aula_web_exemplo.model.Paciente;
import com.unifil.aula_web_exemplo.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Paciente> findAll() {
        return pessoaRepository.findAll();
    }
}
