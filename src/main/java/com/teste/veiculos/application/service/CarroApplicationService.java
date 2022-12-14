package com.teste.veiculos.application.service;

import com.teste.veiculos.application.api.CarroRequest;
import com.teste.veiculos.application.api.CarroResponse;
import com.teste.veiculos.application.domain.Carro;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class CarroApplicationService implements CarroService{
    @Override
    public CarroResponse criaCarro(CarroRequest carroRequest) {
        log.info("[INICIA] CarroApplicationService - postCarro");
        Carro carro = carroRepository.salva(new Carro(carroRequest));
        log.info("[FINALIZA] CarroApplicationService - postCarro");
        return null;
    }
}
