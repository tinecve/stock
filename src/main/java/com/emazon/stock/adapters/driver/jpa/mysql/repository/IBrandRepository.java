package com.emazon.stock.adapters.driver.jpa.mysql.repository;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandRepository extends JpaRepository<BrandEntity, Long> {

}
