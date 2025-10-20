package com.felipe.reiz.tarefa.repository;

import com.felipe.reiz.tarefa.model.Atendente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtendenteRepository extends JpaRepository<Atendente, Long> {
    Atendente findByEmail(String email);
}
