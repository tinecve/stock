package com.emazon.stock.domain.spi;

import com.emazon.stock.domain.model.Brand;

public interface IBrandPersistencePort {

    void saveBrand(Brand brand);

}
