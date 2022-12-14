package com.teste.veiculos.infra;

import com.teste.veiculos.application.domain.Carro;
import com.teste.veiculos.application.repository.CarroRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class CarroInfraRepository implements CarroRepository {
    @Override
    public Carro salva(Carro carro) {
        log.info("[INICIA] CarroInfraRepository - salva");
        log.info("[FINALIZA] CarroInfraRepository - salva");
        return carro;
    }
}
