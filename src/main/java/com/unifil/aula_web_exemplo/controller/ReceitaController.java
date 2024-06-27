package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.ReceitaService;
import com.unifil.aula_web_exemplo.model.Paciente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/receitas")
public class ReceitaController {

    private final ReceitaService receitaService;

    public ReceitaController(ReceitaService receitaService) {
        this.receitaService = receitaService;
    }

    @GetMapping
    public List<Paciente> getAllReceitas() {
        return receitaService.findAll();
    }

    @PostMapping
    public List<Paciente> postAllReceitas () { return receitaService.findAll(); }

    @DeleteMapping
    public List<Paciente> deleteAllReceitas () { return receitaService.findAll(); }

    @PutMapping
    public List<Paciente> putAllReceitas () { return receitaService.findAll(); }
}


