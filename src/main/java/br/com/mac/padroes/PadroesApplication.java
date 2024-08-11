package br.com.mac.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes modulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * @author DaniloMac
 */
@EnableFeignClients
@SpringBootApplication
public class PadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesApplication.class, args);
	}

}
