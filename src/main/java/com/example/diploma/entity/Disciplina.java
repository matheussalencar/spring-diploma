package com.example.diploma.entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Disciplina {
    @NotNull(message = "nao pode ser nulo")
    @Size(min = 8, max = 50, message = "No minimo 8 caracteres")
    @NotEmpty(message = "Nao pode ser vazia")
    private String descricao;

    @Size(min = 1, max = 2, message = "nota invalida")
    @Pattern(regexp = "^[0-9]+$", message = "É apenas aceito numeros")
    private Double nota;


    public Disciplina(String descricao, Double nota) {
        this.descricao = descricao;
        this.nota = nota;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Double getNota() {
        return nota;
    }


    public void setNota(Double nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Disciplina [descricao=" + descricao + ", nota=" + nota + "]";
    }

    
}
