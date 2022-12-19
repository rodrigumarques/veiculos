package com.teste.veiculos.application.api;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class CarroAlteracaoRequest {
    @NotNull
    @NotEmpty
    private String veiculo;
    @NotNull
    @NotEmpty
    private String marca;
    @NotNull
    private int ano;

    private Boolean vendido;
}
