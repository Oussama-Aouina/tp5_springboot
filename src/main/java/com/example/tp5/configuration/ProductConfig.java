package com.example.tp5.configuration;

import com.example.tp5.model.Product;
import com.example.tp5.repository.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
@AllArgsConstructor
public class ProductConfig {
    @Bean
    CommandLineRunner commandLineRunner(ProductRepo productRep) {
        return args -> {
            Product product1 = new Product("eye_creme", "efficient for dark cercles", 50);
            Product product2 = new Product("night_creme", "efficient for highdrated face", 80);
        };
    }
}
