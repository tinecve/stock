package com.emazon.stock.adapters.driver.jpa.mysql.repository;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
