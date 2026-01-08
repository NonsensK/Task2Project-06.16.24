package com.example.migration.task2project.product.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super("Product not found, id=" + id);
    }
}
