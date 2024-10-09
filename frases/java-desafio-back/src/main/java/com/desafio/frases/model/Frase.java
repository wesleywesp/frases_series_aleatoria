package com.desafio.frases.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="frases")
@Getter
@Setter
public class Frase{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 1000)
    private String titulo;
    private String personagem;
    @Column(length = 1000)
    private String poster;
    private String frase;
}
