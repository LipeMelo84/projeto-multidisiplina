package com.felipe.reiz.tarefa.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Atendente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String senha;
}