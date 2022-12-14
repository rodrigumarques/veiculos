package com.teste.veiculos.cadastroVeiculos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Entity
public class carros {
    @Id
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

    public carros(UUID id, String veiculo, String marca, int ano, Boolean vendido) {
        this.id = UUID.randomUUID();
        this.veiculo = veiculo;
        this.marca = marca;
        this.ano = ano;
        this.vendido = vendido;
        this.created = LocalDateTime.now();
    }
}
