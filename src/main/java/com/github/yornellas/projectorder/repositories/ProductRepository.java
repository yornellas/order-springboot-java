package com.github.yornellas.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.yornellas.projectorder.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
