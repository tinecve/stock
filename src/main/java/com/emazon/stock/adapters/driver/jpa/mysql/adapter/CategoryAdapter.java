package com.emazon.stock.adapters.driver.jpa.mysql.adapter;

import com.emazon.stock.adapters.driver.jpa.mysql.mapper.ICategoryEntityMapper;
import com.emazon.stock.adapters.driver.jpa.mysql.repository.ICategoryRepository;
import com.emazon.stock.domain.model.Category;
import com.emazon.stock.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CategoryAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryMapper;

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(categoryMapper.toEntity(category));
    }
}
