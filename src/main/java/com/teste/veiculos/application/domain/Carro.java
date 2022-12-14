package com.teste.veiculos.application.domain;

import com.teste.veiculos.application.api.CarroRequest;
import jakarta.persistence.*;
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
    private UUID idVeiculo;
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

    public Carro(CarroRequest carroRequest) {
        this.veiculo = carroRequest.getVeiculo();
        this.marca = carroRequest.getMarca();
        this.ano = carroRequest.getAno();
        this.vendido = carroRequest.getVendido();
        this.created = LocalDateTime.now();
    }
}
