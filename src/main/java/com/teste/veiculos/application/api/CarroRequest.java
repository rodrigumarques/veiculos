package com.teste.veiculos.application.api;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class CarroRequest {
    @NotBlank
    private String veiculo;
    @NotBlank
    private String marca;
    @NotBlank
    private int ano;

    private Boolean vendido;
}
