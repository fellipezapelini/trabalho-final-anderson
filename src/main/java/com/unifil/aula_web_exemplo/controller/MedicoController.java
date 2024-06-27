package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.MedicoService;
import com.unifil.aula_web_exemplo.model.Paciente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    private final MedicoService medicoService;

    public MedicoController(MedicoService medicoService) {
        this.medicoService = medicoService;
    }

    @GetMapping
    public List<Paciente> getAllMedicos() {
        return medicoService.findAll();
    }

    @PostMapping
    public List<Paciente> postAllMedicos () { return medicoService.findAll(); }

    @DeleteMapping
    public List<Paciente> deleteAllMedicos () { return medicoService.findAll(); }

    @PutMapping
    public List<Paciente> putAllMedicos () { return medicoService.findAll(); }
}

