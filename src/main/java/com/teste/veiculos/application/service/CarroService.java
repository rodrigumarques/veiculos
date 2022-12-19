package com.teste.veiculos.application.service;

import com.teste.veiculos.application.api.*;

import java.util.List;
import java.util.UUID;

public interface CarroService {
    CarroResponse criaCarro(CarroRequest carroRequest);
    List<CarroListResponse> buscaTodosCarros();
    CarroDetalhadoResponse buscaCarroPorId(UUID idVeiculo);
    void deletaCarroPorId(UUID idVeiculo);
    void patchAtualizaVeiculo(UUID idVeiculo, CarroAlteracaoRequest carroAlteracaoRequest);
}
