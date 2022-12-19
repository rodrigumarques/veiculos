package com.teste.veiculos.infra;

import com.teste.veiculos.application.domain.Carro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CarroSpringDataJPARepository extends JpaRepository<Carro, UUID> {
}
