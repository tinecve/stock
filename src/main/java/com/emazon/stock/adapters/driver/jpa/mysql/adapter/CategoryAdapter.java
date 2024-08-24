package com.emazon.stock.adapters.driver.jpa.mysql.adapter;

import com.emazon.stock.adapters.driver.jpa.mysql.entity.CategoryEntity;
import com.emazon.stock.adapters.driver.jpa.mysql.exception.NoDataFoundException;
import com.emazon.stock.adapters.driver.jpa.mysql.mapper.ICategoryEntityMapper;
import com.emazon.stock.adapters.driver.jpa.mysql.repository.ICategoryRepository;
import com.emazon.stock.domain.model.Category;
import com.emazon.stock.domain.spi.ICategoryPersistencePort;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@RequiredArgsConstructor
public class CategoryAdapter implements ICategoryPersistencePort {

    private final ICategoryRepository categoryRepository;
    private final ICategoryEntityMapper categoryMapper;

    @Override
    public void saveCategory(Category category) {
        categoryRepository.save(categoryMapper.toEntity(category));
    }

    @Override
    public List<Category> getAllCategories(Integer page, Integer size, String order) {
        Pageable pagination = PageRequest.of(page, size);
        List<CategoryEntity> categories;
        if(order == null){
            categories = categoryRepository.findAll(pagination).getContent();
        }else {
            if(order.equals("asc")) {
                categories = categoryRepository.findAllByOrderByNameAsc(pagination).getContent();
            } else if(order.equals("desc")){
                categories = categoryRepository.findAllByOrderByNameDesc(pagination).getContent();
            } else{
                categories = categoryRepository.findAll(pagination).getContent();
            }
        }
        if(categories.isEmpty()){
            throw new NoDataFoundException();
        }
        return categoryMapper.toModelList(categories);
    }
}
