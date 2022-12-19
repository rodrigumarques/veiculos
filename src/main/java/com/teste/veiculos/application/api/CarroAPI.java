package com.teste.veiculos.application.api;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

//CADASTRO DE VEICULOS
@RestController
@RequestMapping("/v1/carro")
public interface CarroAPI {
    //POST-Salva veículo
    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    CarroResponse postCarro(@Valid @RequestBody CarroRequest carroRequest);

    //GET-Busca Todos os veículos
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    List<CarroListResponse> getTodosCarros();

    //GET-Busca por Id do veículo
    @GetMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.OK)
    CarroDetalhadoResponse getCarroPorId(@PathVariable UUID idVeiculo);

    //DELETE-Deleta veículo
    @DeleteMapping(value = "/{idVeiculo}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    void deletaCarroPorId(@PathVariable UUID idVeiculo);
}
