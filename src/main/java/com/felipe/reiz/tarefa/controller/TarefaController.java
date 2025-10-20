package com.felipe.reiz.tarefa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.reiz.tarefa.model.Tarefa;
import com.felipe.reiz.tarefa.repository.TarefaRepository;

@RestController
@RequestMapping("/api/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @PostMapping
    public Tarefa criarTarefa(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Tarefa> buscarPorId(@PathVariable Long id) {
        return tarefaRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Tarefa atualizarTarefa(@PathVariable Long id, @RequestBody Tarefa tarefaAtualizada) {
        return tarefaRepository.findById(id).map(tarefa -> {
            tarefa.setNome(tarefaAtualizada.getNome());
            tarefa.setDataEntrega(tarefaAtualizada.getDataEntrega());
            tarefa.setResponsavel(tarefaAtualizada.getResponsavel());
            return tarefaRepository.save(tarefa);
        }).orElseThrow(() -> new RuntimeException("Tarefa não encontrada"));
    }

    @DeleteMapping("/{id}")
    public void deletarTarefa(@PathVariable Long id) {
        tarefaRepository.deleteById(id);
    }
}
