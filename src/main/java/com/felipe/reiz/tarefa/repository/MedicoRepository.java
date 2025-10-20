package com.felipe.reiz.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.reiz.tarefa.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
