package com.felipe.reiz.tarefa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipe.reiz.tarefa.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
