package com.emazon.stock.adapters.driver.jpa.mysql.repository;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.CategoryEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<CategoryEntity, Long> {

    Page<CategoryEntity> findAll(Pageable pageable);

    Page<CategoryEntity> findAllByOrderByNameDesc(Pageable pageable);
    Page<CategoryEntity> findAllByOrderByNameAsc(Pageable pageable);
}
