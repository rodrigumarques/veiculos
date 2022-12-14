package com.teste.veiculos.application.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID id;
    @NotNull
    @NotEmpty
    private String veiculo;
    @NotNull
    @NotEmpty
    private String marca;
    @NotNull
    private int ano;
    @NotNull
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
