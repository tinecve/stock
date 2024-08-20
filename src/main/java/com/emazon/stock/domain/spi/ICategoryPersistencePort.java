package com.emazon.stock.domain.spi;

import com.emazon.stock.domain.model.Category;

public interface ICategoryPersistencePort {

    void saveCategory(Category category);

}
