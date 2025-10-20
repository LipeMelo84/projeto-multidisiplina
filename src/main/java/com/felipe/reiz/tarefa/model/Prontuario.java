package com.felipe.reiz.tarefa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Prontuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Consulta consulta;

    private String descricao;
    private String prescricao;
}
