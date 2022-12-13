package com.teste.veiculos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class VeiculosApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Veiculos - Home";
	}
	public static void main(String[] args) {
		SpringApplication.run(VeiculosApplication.class, args);
	}

}
