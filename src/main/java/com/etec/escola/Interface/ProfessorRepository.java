package com.etec.escola.Interface;

import com.etec.escola.Models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor,Long> {
// o tipo de chave primaria é long
}
