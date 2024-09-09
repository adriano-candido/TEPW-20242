package br.edu.unichristus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @GetMapping("/somar")
    public Double somar(@RequestParam Double n1, @RequestParam Double n2){
        return n1 + n2;
    }

}
