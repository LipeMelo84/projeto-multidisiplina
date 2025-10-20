package com.felipe.reiz.tarefa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.reiz.tarefa.model.Medico;
import com.felipe.reiz.tarefa.repository.MedicoRepository;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public Medico cadastrarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    public Optional<Medico> buscarPorId(Long id) {
        return medicoRepository.findById(id);
    }

    public void deletarMedico(Long id) {
        medicoRepository.deleteById(id);
    }
}
