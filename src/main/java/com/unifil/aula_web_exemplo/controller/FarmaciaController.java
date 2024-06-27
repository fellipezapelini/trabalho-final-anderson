package com.unifil.aula_web_exemplo.controller;

import com.unifil.aula_web_exemplo.FarmaciaService;
import com.unifil.aula_web_exemplo.model.Paciente;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciaController {

    private final FarmaciaService farmaciaService;

    public FarmaciaController(FarmaciaService farmaciaService) {
        this.farmaciaService = farmaciaService;
    }

    @GetMapping
    public List<Paciente> getAllFarmacias() {
        return farmaciaService.findAll();
    }

    @PostMapping
    public List<Paciente> postAllFarmacias () { return farmaciaService.findAll(); }

    @DeleteMapping
    public List<Paciente> deleteAllFarmacias () { return farmaciaService.findAll(); }

    @PutMapping
    public List<Paciente> putAllFarmacias () { return farmaciaService.findAll(); }
}
