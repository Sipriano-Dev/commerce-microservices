package com.sipriano.commerce.sales.controller;

import com.sipriano.commerce.sales.domain.Sale;
import com.sipriano.commerce.sales.repository.SalesRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SalesController {

    private final SalesRepository salesRepository;


    public SalesController(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    @PostMapping
    public Sale create(@RequestBody Sale product) {
        return salesRepository.save(product);
    }

    @GetMapping
    public List<Sale> findAll() {
        return salesRepository.findAll();
    }

    @GetMapping("/{id}")
    public Sale findById(@PathVariable String id) {
        return salesRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Sale update(@PathVariable String id, @RequestBody Sale sale) {
        return salesRepository.findById(id)
                .map(saleDb -> {
                    saleDb.setProductId(sale.getProductId());
                    saleDb.setQuantity(sale.getQuantity());
                    saleDb.setTotalValue(sale.getTotalValue());
                    return salesRepository.save(saleDb);
                })
                .orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        salesRepository.findById(id).ifPresent(salesRepository::delete);
    }
}
