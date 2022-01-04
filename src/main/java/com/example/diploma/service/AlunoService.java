package com.example.diploma.service;

import java.util.ArrayList;
import java.util.List;

import com.example.diploma.entity.Aluno;
import com.example.diploma.entity.Disciplina;

import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    List<Aluno> listaAlunos = new ArrayList<Aluno>();

    /*
    public AlunoService(List<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
 
     */

    public Aluno create(Aluno aluno) {
        listaAlunos.add(aluno);
        return aluno;
    }

    public List<Aluno> getAlunos() {
        return listaAlunos;
    }

    public Aluno getAluno(String nome) {
        for (int i=0; i < listaAlunos.size(); i++) {
            if (listaAlunos.get(i).getNome().equals(nome)) {
                return listaAlunos.get(i);
            }
        }
        return null;
    } 

    public String getAlunoMedia(String nome) {
        double media = 0;
        Aluno aluno = getAluno(nome);
        for (Disciplina disciplina: aluno.getListaDisciplinas()) {
            media += disciplina.getNota();
        }

        media = media/aluno.getListaDisciplinas().size();

        if (media > 9.0) {
            return aluno.toString() + "\nMédia " + media + " Parabens pelo desempenho!!";
        }

        return aluno.toString() + "\nMédia" + media/aluno.getListaDisciplinas().size();
    }

    public Aluno editAluno(Aluno aluno) {
        for (Aluno al: listaAlunos) {
            if (al.getNome().equals(aluno.getNome())) {
                listaAlunos.set(listaAlunos.indexOf(al), aluno);
                return aluno;
            }
        }
        return null;
    }


    public String removerAluno(Aluno aluno) {
        for (Aluno al: listaAlunos) {
            if (al.getNome().equals(aluno.getNome())) {
                listaAlunos.remove(al);
                return "ALUNO REMOVIDO\n\n" + al.toString();
            }
        }
        return null;
    }

}
