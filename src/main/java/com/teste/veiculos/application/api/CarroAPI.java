package com.teste.veiculos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//CADASTRO DE VEICULOS
@RestController
@RequestMapping("/v1/carro")
public interface CarroAPI {
    //POST-Salva Veículo
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CarroResponse postCarro(@Valid @RequestBody CarroRequest carroRequest);
    //GET-Busca Todos Os Veículos
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<CarroListResponse> getTodosCarros();

}
