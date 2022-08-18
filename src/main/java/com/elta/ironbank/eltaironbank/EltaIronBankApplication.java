package com.elta.ironbank.eltaironbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Import(MyCustomBeansDefinitionRegistrar.class)
public class EltaIronBankApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EltaIronBankApplication.class, args);
        System.out.println();
    }

}
