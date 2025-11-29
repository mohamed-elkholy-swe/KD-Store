package com.example.KD_Store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.KD_Store.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
