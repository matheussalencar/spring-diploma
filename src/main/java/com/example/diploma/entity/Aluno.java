package com.example.diploma.entity;

import javax.validation.constraints.*;
import java.util.List;

public class Aluno {
    @NotNull(message = "é necessario ter nome")
    @Size(min = 8, max = 50, message = "tamanho minimo 8")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "É apenas aceito caracteres de A-Z")
    private String nome;

    @NotNull(message = "é necessario informar o campo de endereco")
    @NotEmpty(message = "nao pode ser vazio")
    @Size(min = 10, message = "tamanho minimo 10")
    private String endereco;

    @Min(1)

    private int idade;

    private List<Disciplina> listaDisciplinas;

    public Aluno(String nome, String endereco, int idade, List<Disciplina> listaDisciplinas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.listaDisciplinas = listaDisciplinas;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }
    public void setListaDisciplinas(List<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Aluno [endereco=" + endereco + ", idade=" + idade + ", listaDisciplinas=" + listaDisciplinas + ", nome="
                + nome + "]";
    }

}
