package com.example.migration.task2project.product.mapper;

import com.example.migration.task2project.product.domain.Product;
import com.example.migration.task2project.product.dto.ProductRequest;
import com.example.migration.task2project.product.dto.ProductResponse;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    public Product toDomain(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        return product;
    }

    public ProductResponse toResponse(Product product) {
        ProductResponse response = new ProductResponse();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setPrice(product.getPrice());
        return response;
    }

    public void updateDomain(Product product, ProductRequest request) {
        product.setName(request.getName());
        product.setPrice(request.getPrice());
    }
}
