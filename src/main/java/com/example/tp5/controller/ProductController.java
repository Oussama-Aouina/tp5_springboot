package com.example.tp5.controller;

import com.example.tp5.model.Product;
import com.example.tp5.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin("**")
@RequestMapping(path = "api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProdoucts();
    }

    @PostMapping("/save")
    public void saveProduct(@RequestBody Product product) {
        productService.addProduct(product);

    }
}
