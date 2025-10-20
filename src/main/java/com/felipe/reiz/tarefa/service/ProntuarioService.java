package com.felipe.reiz.tarefa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipe.reiz.tarefa.model.Prontuario;
import com.felipe.reiz.tarefa.repository.ProntuarioRepository;

@Service
public class ProntuarioService {

    @Autowired
    private ProntuarioRepository prontuarioRepository;

    public Prontuario salvarProntuario(Prontuario prontuario) {
        return prontuarioRepository.save(prontuario);
    }

    public List<Prontuario> listarProntuarios() {
        return prontuarioRepository.findAll();
    }

    public Optional<Prontuario> buscarPorId(Long id) {
        return prontuarioRepository.findById(id);
    }

    public void deletarProntuario(Long id) {
        prontuarioRepository.deleteById(id);
    }
}
