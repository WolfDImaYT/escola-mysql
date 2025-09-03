package com.etec.escola.Service;

import com.etec.escola.Interface.AlunoRepository;
import com.etec.escola.Models.Aluno;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {

    private final AlunoRepository alunoRepository; // nivel desegurança final, imutavel
    /*ta recebendo o valor do Alunorepository*/

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> buscarAluno(){
        return alunoRepository.findAll();
    } // listar aluno

    public Aluno salvarAluno(Aluno Aluno){
        return alunoRepository.save(Aluno);
    }// salvar aluno. o aluno(com "a" menor) ta salvando na memoria em tempo real

    public Aluno buscarAlunoId(Long id){
        return alunoRepository.findById(id).orElse(null);
    }

    public void deletarAluno (Long id){
       alunoRepository.deleteById(id);
    }
}

