package com.teste.veiculos.application.repository;

import com.teste.veiculos.application.api.CarroAlteracaoRequest;
import com.teste.veiculos.application.domain.Carro;

import java.util.List;
import java.util.UUID;

public interface CarroRepository {
    Carro salva(Carro carro);
    List<Carro> buscaTodosCarros();
    Carro buscaCarroPorId(UUID idVeiculo);
    void deletaCarro(Carro carro);
}
