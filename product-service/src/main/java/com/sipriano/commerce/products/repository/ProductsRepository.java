package com.sipriano.commerce.products.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sipriano.commerce.products.domain.Product;

public interface ProductsRepository extends MongoRepository<Product, String> {
}