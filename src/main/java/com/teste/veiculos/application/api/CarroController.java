package com.teste.veiculos.application.api;

import com.teste.veiculos.application.service.CarroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CarroController implements CarroAPI{
    private final CarroService carroService;
    @Override
    public CarroResponse postCarro(CarroRequest carroRequest) {
        log.info("[INICIA] CarroController - postCarro");
        CarroResponse carroCriado = carroService.criaCarro(carroRequest);
        log.info("[FINALIZA] CarroController - postCarro");
        return carroCriado;
    }

    @Override
    public List<CarroListResponse> getTodosCarros() {
        log.info("[INICIA] CarroController - getTodosCarros");
        List<CarroListResponse> carros = carroService.buscaTodosCarros();
        log.info("[FINALIZA] CarroController - getTodosCarros");
        return carros;
    }

    @Override
    public CarroDetalhadoResponse getCarroPorId(UUID idVeiculo) {
        log.info("[INICIA] CarroController - getCarroPorId");
        log.info("[IdVeiculo] {}", idVeiculo);
        CarroDetalhadoResponse carroDetalhado = carroService.buscaCarroPorId(idVeiculo);
        log.info("[FINALIZA] CarroController - getCarroPorId");
        return carroDetalhado;
    }

    @Override
    public void deletaCarroPorId(UUID idVeiculo) {
        log.info("[INICIA] CarroController - deletaCarroPorId");
        log.info("[IdVeiculo] {}", idVeiculo);
        log.info("[FINALIZA] CarroController - deletaCarroPorId");
    }

}
