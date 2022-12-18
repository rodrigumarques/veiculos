package com.teste.veiculos.application.api;

import lombok.Value;

import java.time.LocalDateTime;
import java.util.UUID;
@Value
public class CarroDetalhadoResponse {
    private UUID idVeiculo;
    private String marca;
    private int ano;
    private Boolean vendido;
    private LocalDateTime created;
}
