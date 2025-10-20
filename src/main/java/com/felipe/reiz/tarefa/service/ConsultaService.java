package com.felipe.reiz.tarefa.service;

import com.felipe.reiz.tarefa.model.Consulta;
import com.felipe.reiz.tarefa.model.Medico;
import com.felipe.reiz.tarefa.model.Paciente;
import com.felipe.reiz.tarefa.repository.ConsultaRepository;
import com.felipe.reiz.tarefa.repository.MedicoRepository;
import com.felipe.reiz.tarefa.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private MedicoRepository medicoRepository;

    public Consulta agendarConsulta(Long pacienteId, Long medicoId, LocalDateTime dataHora) {
        Optional<Paciente> pacienteOpt = pacienteRepository.findById(pacienteId);
        Optional<Medico> medicoOpt = medicoRepository.findById(medicoId);

        if (pacienteOpt.isEmpty() || medicoOpt.isEmpty()) {
            throw new RuntimeException("Paciente ou médico não encontrado");
        }

        Consulta consulta = new Consulta();
        consulta.setPaciente(pacienteOpt.get());
        consulta.setMedico(medicoOpt.get());
        consulta.setDataHora(dataHora);

        return consultaRepository.save(consulta);
    }

    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }

    public void cancelarConsulta(Long consultaId) {
        consultaRepository.deleteById(consultaId);
    }

    public Consulta atualizarConsulta(Long consultaId, LocalDateTime novaDataHora) {
        Consulta consulta = consultaRepository.findById(consultaId)
                .orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
        consulta.setDataHora(novaDataHora);
        return consultaRepository.save(consulta);
    }
}

