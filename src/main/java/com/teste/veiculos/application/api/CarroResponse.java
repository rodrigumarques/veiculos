package com.teste.veiculos.application.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;
@Value
@Builder
public class CarroResponse {
    private UUID idVeiculo;
}
