package com.etec.escola.Controller;


import com.etec.escola.Models.Professor;
import com.etec.escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping/*<- requisição de rota*/("/professor") // finir uma rota
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }


    //alistar o professor:
    @GetMapping
    public List<Professor> ListadeProfessor(){
        return professorService.buscarProfessor();
    }

    //salvar o professor:
    @PostMapping // inserir
    public Professor salvarnovoProfessor(@RequestBody Professor dadosProfessor){
        return professorService.salvarProfessor(dadosProfessor);
    }

    //buscar o professor:
    @GetMapping("/{id}")
    public Professor buscarProfessor (@PathVariable/*<- se estiver usando ID*/ Long id){
        return professorService.buscarProfessorId(id);
    }

    //deletar o professor:
    @DeleteMapping("/{id}")
    public void excluirProfessor (@PathVariable Long id){
        professorService.deletarProfessor(id);
    }
}
