package com.teste.veiculos.infra;

import com.teste.veiculos.application.domain.Carro;
import com.teste.veiculos.application.repository.CarroRepository;
import com.teste.veiculos.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class CarroInfraRepository implements CarroRepository {
    private final ClienteSpringDataJPARepository clienteSpringDataJPARepository;

    @Override
    public Carro salva(Carro carro) {
        log.info("[INICIA] CarroInfraRepository - salva");
        clienteSpringDataJPARepository.save(carro);
        log.info("[FINALIZA] CarroInfraRepository - salva");
        return carro;
    }

    @Override
    public List<Carro> buscaTodosCarros() {
        log.info("[INICIA] CarroInfraRepository - buscaTodosCarros");
        List<Carro> todosCarros = clienteSpringDataJPARepository.findAll();
        log.info("[FINALIZA] CarroInfraRepository - buscaTodosCarros");
        return todosCarros;
    }

    @Override
    public Carro buscaCarroPorId(UUID idVeiculo) {
        log.info("[INICIA] CarroInfraRepository - buscaCarroPorId");
        Carro carro = clienteSpringDataJPARepository.findById(idVeiculo)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Veículo não encontrado!"));
        log.info("[FINALIZA] CarroInfraRepository - buscaCarroPorId");
        return carro;
    }
}
