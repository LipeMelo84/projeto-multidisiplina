package com.felipe.reiz.tarefa.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.reiz.tarefa.model.Consulta;

@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByPacienteId(Long pacienteId);
    List<Consulta> findByMedicoId(Long medicoId);
    Optional<Consulta> findByMedicoIdAndDataHora(Long medicoId, LocalDateTime dataHora);
}
