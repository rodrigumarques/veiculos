package com.teste.veiculos.application.api;

import com.teste.veiculos.application.service.CarroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
        log.info("[FINALIZA] CarroController - getTodosCarros");
        return null;
    }

}
