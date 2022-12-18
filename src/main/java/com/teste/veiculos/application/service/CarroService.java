package com.teste.veiculos.application.service;

import com.teste.veiculos.application.api.CarroDetalhadoResponse;
import com.teste.veiculos.application.api.CarroListResponse;
import com.teste.veiculos.application.api.CarroRequest;
import com.teste.veiculos.application.api.CarroResponse;

import java.util.List;
import java.util.UUID;

public interface CarroService {
    CarroResponse criaCarro(CarroRequest carroRequest);
    List<CarroListResponse> buscaTodosCarros();
    CarroDetalhadoResponse buscaCarroPorId(UUID idVeiculo);
}
