package com.cts.microcredential.catalogue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.cts.microcredential.catalogue.*")
@EnableJpaRepositories("com.cts.microcredential.catalogue.*")
@ComponentScan("com.cts.microcredential.catalogue")
public class CatalogueServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueServiceApplication.class, args);
	}

}
