package com.teste.veiculos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/carro")
public interface CarroAPI {

    //CADASTRO DE VEICULOS
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CarroResponse postCarro(@Valid @RequestBody CarroRequest carroRequest);
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<CarroListResponse> getTodosCarros();

}
