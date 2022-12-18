package com.teste.veiculos.application.repository;

import com.teste.veiculos.application.domain.Carro;

import java.util.List;

public interface CarroRepository {
    Carro salva(Carro carro);
    List<Carro> buscaTodosCarros();
}
