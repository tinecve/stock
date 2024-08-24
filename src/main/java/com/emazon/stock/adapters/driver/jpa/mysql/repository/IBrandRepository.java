package com.emazon.stock.adapters.driver.jpa.mysql.repository;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.BrandEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<BrandEntity, Long> {

    Page<BrandEntity> findAll(Pageable pageable);

    Page<BrandEntity> findAllByOrderByNameDesc(Pageable pageable);

    Page<BrandEntity> findAllByOrderByNameAsc(Pageable pageable);

}
