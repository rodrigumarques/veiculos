package com.teste.veiculos.infra;

import com.teste.veiculos.application.api.CarroAlteracaoRequest;
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
    private final CarroSpringDataJPARepository carroSpringDataJPARepository;

    //Método de cadastrar o veículo
    @Override
    public Carro salva(Carro carro) {
        log.info("[INICIA] CarroInfraRepository - salva");
        carroSpringDataJPARepository.save(carro);
        log.info("[FINALIZA] CarroInfraRepository - salva");
        return carro;
    }

    //Método de listar todos os veículos cadastrados
    @Override
    public List<Carro> buscaTodosCarros() {
        log.info("[INICIA] CarroInfraRepository - buscaTodosCarros");
        List<Carro> todosCarros = carroSpringDataJPARepository.findAll();
        log.info("[FINALIZA] CarroInfraRepository - buscaTodosCarros");
        return todosCarros;
    }

    //Método de buscar o veículo pelo Id
    @Override
    public Carro buscaCarroPorId(UUID idVeiculo) {
        log.info("[INICIA] CarroInfraRepository - buscaCarroPorId");
        Carro carro = carroSpringDataJPARepository.findById(idVeiculo)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Veículo não encontrado!"));
        log.info("[FINALIZA] CarroInfraRepository - buscaCarroPorId");
        return carro;
    }

    //Método de deletar o veículo
    @Override
    public void deletaCarro(Carro carro) {
        log.info("[INICIA] CarroInfraRepository - deletaCarro");
        carroSpringDataJPARepository.delete(carro);
        log.info("[FINALIZA] CarroInfraRepository - deletaCarro");
    }

}
