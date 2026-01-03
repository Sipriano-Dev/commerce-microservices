package com.sipriano.commerce.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sipriano.commerce.product.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}