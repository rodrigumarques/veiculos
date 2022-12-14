package com.teste.veiculos.infra;

import com.teste.veiculos.application.domain.Carro;
import com.teste.veiculos.application.repository.CarroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

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
}
