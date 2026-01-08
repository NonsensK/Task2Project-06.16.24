package com.example.migration.task2project.product.repository;

import com.example.migration.task2project.product.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
