package br.edu.unichristus.model;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {

    private Integer id;
    private String nome;
    private String cargo;
    private String cpf;


}
