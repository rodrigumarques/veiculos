package com.teste.veiculos.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotBlank
    private String veiculo;
    @NotBlank
    private String marca;
    @NotBlank
    private int ano;

    private Boolean vendido;

    private LocalDateTime created;
    private LocalDateTime updated;

    public Carro(UUID id, String veiculo, String marca, int ano, Boolean vendido) {
        this.veiculo = veiculo;
        this.marca = marca;
        this.ano = ano;
        this.vendido = vendido;
        this.created = LocalDateTime.now();
    }
}
