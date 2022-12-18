package com.teste.veiculos.application.service;

import com.teste.veiculos.application.api.CarroListResponse;
import com.teste.veiculos.application.api.CarroRequest;
import com.teste.veiculos.application.api.CarroResponse;

import java.util.List;

public interface CarroService {
    CarroResponse criaCarro(CarroRequest carroRequest);
    List<CarroListResponse> buscaTodosCarros();
}
