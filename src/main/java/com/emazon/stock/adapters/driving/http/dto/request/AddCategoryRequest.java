package com.emazon.stock.adapters.driving.http.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class AddCategoryRequest {

    @NotNull(message = "Field name cannot be null")
    @NotBlank(message = "Field name cannot be blank")
    @Size(max = 50, message = "Field name cannot be less than 20 characters")
    private final String name;
    @NotNull(message = "Field description cannot be null")
    @NotBlank(message = "Field description cannot be blank")
    @Size(max = 90, message = "Field description cannot be less than 90 characters")
    private final String description;

}
