package com.example.migration.task2project.product.service;

import com.example.migration.task2project.product.domain.Product;
import com.example.migration.task2project.product.dto.ProductRequest;
import com.example.migration.task2project.product.dto.ProductResponse;
import com.example.migration.task2project.product.exception.ProductNotFoundException;
import com.example.migration.task2project.product.mapper.ProductMapper;
import com.example.migration.task2project.product.repository.ProductRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductService(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ProductResponse> findAll() {
        return repository.findAll().stream().map(mapper::toResponse).toList();
    }

    public ProductResponse findById(Long id) {
        Product product = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        return mapper.toResponse(product);
    }

    @Transactional
    public ProductResponse create(ProductRequest request) {
        Product product = mapper.toDomain(request);
        return mapper.toResponse(repository.save(product));
    }

    @Transactional
    public ProductResponse update(Long id, ProductRequest request) {
        Product product = repository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
        mapper.updateDomain(product, request);
        return mapper.toResponse(repository.save(product));
    }

    @Transactional
    public void delete(Long id) {
        if (!repository.existsById(id)) {
            throw new ProductNotFoundException(id);
        }
        repository.deleteById(id);
    }
}
