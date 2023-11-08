package com.fullcycle.admin.catalogo.domain.application;

import com.fullcycle.admin.catalogo.domain.application.configuration.WebServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(WebServerConfig.class, args);
    }
}