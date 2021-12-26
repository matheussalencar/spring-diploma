package com.example.diploma.entity;

import java.util.List;

public class Aluno {
    private String nome;
    private String endereco;
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
