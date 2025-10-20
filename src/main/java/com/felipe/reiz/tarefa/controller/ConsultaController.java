package com.felipe.reiz.tarefa.controller;

import com.felipe.reiz.tarefa.model.Consulta;
import com.felipe.reiz.tarefa.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaService consultaService;

    @PostMapping("/agendar")
    public Consulta agendarConsulta(
            @RequestParam Long pacienteId,
            @RequestParam Long medicoId,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime dataHora) {
        return consultaService.agendarConsulta(pacienteId, medicoId, dataHora);
    }

    @GetMapping
    public List<Consulta> listarConsultas() {
        return consultaService.listarConsultas();
    }

    @DeleteMapping("/cancelar/{id}")
    public void cancelarConsulta(@PathVariable Long id) {
        consultaService.cancelarConsulta(id);
    }

    @PutMapping("/atualizar/{id}")
    public Consulta atualizarConsulta(
            @PathVariable Long id,
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime novaDataHora) {
        return consultaService.atualizarConsulta(id, novaDataHora);
    }
}
