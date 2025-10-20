package com.felipe.reiz.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.reiz.tarefa.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
