package com.sipriano.commerce.products.controller;

import com.sipriano.commerce.products.domain.Product;
import com.sipriano.commerce.products.repository.ProductsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsRepository repository;

    public ProductsController(ProductsRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return repository.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable String id) {
        return repository.findById(id).orElse(null);
    }
}