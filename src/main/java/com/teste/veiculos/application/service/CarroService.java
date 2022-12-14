package com.teste.veiculos.application.service;

import com.teste.veiculos.application.api.CarroRequest;
import com.teste.veiculos.application.api.CarroResponse;

public interface CarroService {
    CarroResponse criaCarro(CarroRequest carroRequest);
}
