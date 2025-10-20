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

import com.felipe.reiz.tarefa.model.Prontuario;
import com.felipe.reiz.tarefa.service.ProntuarioService;

@RestController
@RequestMapping("/prontuarios")
public class ProntuarioController {

    @Autowired
    private ProntuarioService prontuarioService;

    @PostMapping
    public ResponseEntity<Prontuario> salvar(@RequestBody Prontuario prontuario) {
        return ResponseEntity.ok(prontuarioService.salvarProntuario(prontuario));
    }

    @GetMapping
    public ResponseEntity<List<Prontuario>> listar() {
        return ResponseEntity.ok(prontuarioService.listarProntuarios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Prontuario>> buscar(@PathVariable Long id) {
        return ResponseEntity.ok(prontuarioService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        prontuarioService.deletarProntuario(id);
        return ResponseEntity.noContent().build();
    }
}
