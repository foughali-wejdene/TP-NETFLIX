package com.example.webservice2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
@SpringBootApplication

@EnableCircuitBreaker
public class Microservice2Application {
    public static void main(String[] args) {
        SpringApplication.run(Microservice2Application.class, args);
    } }
