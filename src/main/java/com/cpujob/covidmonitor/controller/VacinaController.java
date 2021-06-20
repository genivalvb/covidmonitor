package com.cpujob.covidmonitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/vacinas")
public class VacinaController {

    @GetMapping
    public String getTexto(){
        return "Bem vindo a SELVA";
    }
}
