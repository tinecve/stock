package com.emazon.stock.adapters.driving.http.mapper;

import com.emazon.stock.adapters.driving.http.dto.request.AddBrandRequest;
import com.emazon.stock.adapters.driving.http.dto.request.UpdateCategoryRequest;
import com.emazon.stock.domain.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IBrandRequestMapper {

    @Mapping(target = "id", ignore = true)
    Brand addRequestToBrand(AddBrandRequest addBrandRequest);

    Brand updateRequestToBrand(UpdateCategoryRequest updateCategoryRequest);

}
