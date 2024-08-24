package com.emazon.stock.adapters.driver.jpa.mysql.adapter;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.BrandEntity;
import com.emazon.stock.adapters.driver.jpa.mysql.exception.NoDataFoundException;
import com.emazon.stock.adapters.driver.jpa.mysql.mapper.IBrandEntityMapper;
import com.emazon.stock.adapters.driver.jpa.mysql.repository.IBrandRepository;
import com.emazon.stock.domain.model.Brand;
import com.emazon.stock.domain.spi.IBrandPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class BrandAdapter implements IBrandPersistencePort {

    private final IBrandRepository brandRepository;
    private final IBrandEntityMapper brandEntityMapper;

    @Override
    public void saveBrand(Brand brand) {
        brandRepository.save(brandEntityMapper.toEntity(brand));
    }

    @Override
    public List<Brand> getAllBrands(Integer page, Integer size, String order) {
        Pageable pagination = PageRequest.of(page, size);
        List<BrandEntity> brands;
        if(order == null){
            brands = brandRepository.findAll(pagination).getContent();
        }else{
            if(order.equals("asc")){
                brands = brandRepository.findAllByOrderByNameAsc(pagination).getContent();
            }else if (order.equals("desc")){
                brands = brandRepository.findAllByOrderByNameDesc(pagination).getContent();
            }else {
                brands = brandRepository.findAll(pagination).getContent();
            }
        }
        if(brands.isEmpty()){
            throw new NoDataFoundException();
        }
        return brandEntityMapper.toModelList(brands);
    }
}
