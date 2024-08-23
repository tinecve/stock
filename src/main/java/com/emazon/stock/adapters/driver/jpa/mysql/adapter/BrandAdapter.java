package com.emazon.stock.adapters.driver.jpa.mysql.adapter;

import com.emazon.stock.adapters.driver.jpa.mysql.mapper.IBrandEntityMapper;
import com.emazon.stock.adapters.driver.jpa.mysql.repository.IBrandRepository;
import com.emazon.stock.domain.model.Brand;
import com.emazon.stock.domain.spi.IBrandPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class BrandAdapter implements IBrandPersistencePort {

    private final IBrandRepository brandRepository;
    private final IBrandEntityMapper brandEntityMapper;

    @Override
    public void saveBrand(Brand brand) {
        this.brandRepository.save(brandEntityMapper.toEntity(brand));
    }
}
