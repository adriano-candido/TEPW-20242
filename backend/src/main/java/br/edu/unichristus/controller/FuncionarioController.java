package br.edu.unichristus.controller;

import br.edu.unichristus.model.Funcionario;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuncionarioController {

    @PostMapping("/cadastrar")
    public Funcionario cadastrar(@RequestBody Funcionario funcionario){
        funcionario.setId(1);
        return funcionario;
    }

}
