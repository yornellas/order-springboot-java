package com.github.yornellas.projectorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.yornellas.projectorder.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
