package com.teste.veiculos.application.api;

import com.teste.veiculos.application.domain.Carro;
import lombok.Value;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
public class CarroListResponse {
    private UUID idVeiculo;
    private String marca;
    private int ano;
    private Boolean vendido;

    public static List<CarroListResponse> converte(List<Carro> carros) {
        return carros.stream().map(CarroListResponse::new).collect(Collectors.toList());
    }

    private CarroListResponse(Carro carro) {
        this.idVeiculo = carro.getIdVeiculo();
        this.marca = carro.getMarca();
        this.ano = carro.getAno();
        this.vendido = carro.getVendido();
    }

}
