package com.sipriano.commerce.products.controller;

import com.sipriano.commerce.products.domain.Product;
import com.sipriano.commerce.products.repository.ProductsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

    private final ProductsRepository productsRepository;

    public ProductsController(ProductsRepository repository) {
        this.productsRepository = repository;
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return productsRepository.save(product);
    }

    @GetMapping
    public List<Product> findAll() {
        return productsRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable String id) {
        return productsRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable String id, @RequestBody Product product) {
        return productsRepository.findById(id)
                .map(productDb -> {
                    productDb.setName(product.getName());
                    productDb.setPrice(product.getPrice());
                    return productsRepository.save(productDb);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        productsRepository.findById(id).ifPresent(productsRepository::delete);
    }

}