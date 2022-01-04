package com.example.diploma.controller;

import java.util.List;

import com.example.diploma.entity.Aluno;
import com.example.diploma.service.AlunoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;

    @PostMapping("/create")
    public Aluno create(@Valid @RequestBody Aluno aluno) {
        alunoService.create(aluno);
        return aluno;
    }

    @GetMapping("/exibirAlunos")
    public List<Aluno> getAlunos() {
        return alunoService.getAlunos();
    }

    @GetMapping("/exibirAluno/{nome}")
    public Aluno getAluno(@PathVariable String nome) {
        return alunoService.getAluno(nome);
    }
    
    @GetMapping("/media/{nome}")
    public String getMediaAluno(@PathVariable String nome) {
        return alunoService.getAlunoMedia(nome);
    }

    @PutMapping("/edit")
    public Aluno editAluno(@RequestBody Aluno aluno) {
        return alunoService.editAluno(aluno);
    }

    @DeleteMapping("/delete")
    public String delAluno(@RequestBody Aluno aluno) {
        return alunoService.removerAluno(aluno);
    }

}