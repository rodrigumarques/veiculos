package com.teste.veiculos.application.api;

import com.teste.veiculos.application.domain.Carro;

import java.util.List;
import java.util.UUID;

public class CarroListResponse {
    private UUID idVeiculo;
    private String marca;
    private int ano;
    private Boolean vendido;

    public static List<CarroListResponse> converte(List<Carro> carros) {
        return null;
    }
}
