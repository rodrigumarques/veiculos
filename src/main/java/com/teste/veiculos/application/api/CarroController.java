package com.teste.veiculos.application.api;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
public class CarroController implements CarroAPI{

    @Override
    public CarroResponse postCarro(CarroRequest carroRequest) {
        log.info("[INICIA] CarroController - postCarro");
        log.info("[FINALIZA] CarroController - postCarro");
        return null;
    }
}
