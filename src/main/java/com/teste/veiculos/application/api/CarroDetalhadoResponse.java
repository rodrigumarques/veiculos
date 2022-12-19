package com.teste.veiculos.application.api;

import com.teste.veiculos.application.domain.Carro;
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

    public CarroDetalhadoResponse(Carro carro) {
        this.idVeiculo = carro.getIdVeiculo();
        this.marca = carro.getMarca();
        this.ano = carro.getAno();
        this.vendido = carro.getVendido();
        this.created = carro.getCreated();
    }

}
