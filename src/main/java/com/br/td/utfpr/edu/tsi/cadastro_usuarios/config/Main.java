package com.br.td.utfpr.edu.tsi.cadastro_usuarios.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.br.td.utfpr.edu.tsi.cadastro_usuarios.repository")
@ComponentScan("com.br.td.utfpr.edu.tsi.cadastro_usuarios")
@PropertySource("file:application.properties")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

}
