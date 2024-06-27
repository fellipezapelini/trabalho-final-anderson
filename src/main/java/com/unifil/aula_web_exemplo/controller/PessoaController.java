package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.PessoaService;
import com.unifil.aula_web_exemplo.model.Paciente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Paciente> getAllPessoas() {
        return pessoaService.findAll();
    }
    @PostMapping
    public List<Paciente> postAllPessoas () { return pessoaService.findAll(); }

    @DeleteMapping
    public List<Paciente> deleteAllPessoas () { return pessoaService.findAll(); }

    @PutMapping
    public List<Paciente> putAllPessoas () { return pessoaService.findAll(); }

}
