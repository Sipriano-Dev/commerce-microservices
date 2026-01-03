package com.sipriano.commerce.sales.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "sales")
public class Sale {

    @Id
    private String id;

    private String productId;
    private Integer quantity;
    private Double totalValue;
}