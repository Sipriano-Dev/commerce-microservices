package com.sipriano.commerce.sales.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sipriano.commerce.sales.domain.Sale;

public interface SalesRepository extends MongoRepository<Sale, String> {
}