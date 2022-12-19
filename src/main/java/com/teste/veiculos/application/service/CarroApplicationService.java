package com.teste.veiculos.application.service;

import com.teste.veiculos.application.api.*;
import com.teste.veiculos.application.domain.Carro;
import com.teste.veiculos.application.repository.CarroRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class CarroApplicationService implements CarroService{

    private final CarroRepository carroRepository;

    @Override
    public CarroResponse criaCarro(CarroRequest carroRequest) {
        log.info("[INICIA] CarroApplicationService - criaCarro");
        Carro carro = carroRepository.salva(new Carro(carroRequest));
        log.info("[FINALIZA] CarroApplicationService - criaCarro");
        return CarroResponse.builder().idVeiculo(carro.getIdVeiculo()).build();
    }

    @Override
    public List<CarroListResponse> buscaTodosCarros() {
        log.info("[INICIA] CarroApplicationService - buscaTodosCarros");
        List<Carro> carros = carroRepository.buscaTodosCarros();
        log.info("[FINALIZA] CarroApplicationService - buscaTodosCarros");
        return CarroListResponse.converte(carros);
    }

    @Override
    public CarroDetalhadoResponse buscaCarroPorId(UUID idVeiculo) {
        log.info("[INICIA] CarroApplicationService - buscaCarroPorId");
        Carro carro = carroRepository.buscaCarroPorId(idVeiculo);
        log.info("[FINALIZA] CarroApplicationService - buscaCarroPorId");
        return new CarroDetalhadoResponse(carro);
    }

    @Override
    public void deletaCarroPorId(UUID idVeiculo) {
        log.info("[INICIA] CarroApplicationService - deletaCarroPorId");
        Carro carro = carroRepository.buscaCarroPorId(idVeiculo);
        carroRepository.deletaCarro(carro);
        log.info("[FINALIZA] CarroApplicationService - deletaCarroPorId");

    }

    @Override
    public void patchAlteraCarro(UUID idVeiculo, @Valid CarroAlteracaoRequest carroAlteracaoRequest) {
        log.info("[INICIA] CarroApplicationService - patchAlteraCarro");
        Carro carro = carroRepository.buscaCarroPorId(idVeiculo);
        carro.altera(carroAlteracaoRequest);
        carroRepository.salva(carro);
        log.info("[FINALIZA] CarroApplicationService - patchAlteraCarro");
    }
}
