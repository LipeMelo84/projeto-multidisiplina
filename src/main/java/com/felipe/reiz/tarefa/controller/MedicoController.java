package com.felipe.reiz.tarefa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.reiz.tarefa.model.Medico;
import com.felipe.reiz.tarefa.service.MedicoService;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoService medicoService;

    @PostMapping
    public ResponseEntity<Medico> cadastrar(@RequestBody Medico medico) {
        return ResponseEntity.ok(medicoService.cadastrarMedico(medico));
    }

    @GetMapping
    public ResponseEntity<List<Medico>> listar() {
        return ResponseEntity.ok(medicoService.listarMedicos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Medico>> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(medicoService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        medicoService.deletarMedico(id);
        return ResponseEntity.noContent().build();
    }
}
