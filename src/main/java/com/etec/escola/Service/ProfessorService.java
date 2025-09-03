package com.etec.escola.Service;


import com.etec.escola.Interface.ProfessorRepository;
import com.etec.escola.Models.Professor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProfessorService {

    private final ProfessorRepository professorRepository;// nivel desegurança final, imutavel

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }
    /*ta recebendo o valor do Alunorepository*/


    public List<Professor> buscarProfessor(){
        return professorRepository.findAll();
    } // listar professor

    public Professor salvarProfessor(Professor professor){
        return professorRepository.save(professor);
    }// salvar professor. o professor(com "p" menor) ta salvando na memoria em tempo real

    public Professor buscarProfessorId(Long id){
        return professorRepository.findById(id).orElse(null);
    }// busca professor

    public void deletarProfessor (Long id){
       professorRepository.deleteById(id);
    }// deleta professor
}

