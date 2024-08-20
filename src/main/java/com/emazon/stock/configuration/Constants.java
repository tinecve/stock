package com.emazon.stock.configuration;

public class Constants {

    private Constants(){
        throw new IllegalStateException("utility class");
    }

    public static final String NO_DATA_FOUND_EXCEPTION_MESSAGE = "No data was found in the database";
    public static final String ELEMENT_NOT_FOUND_EXCEPTION_MESSAGE = "The element indicated does not exists";
    public static final String CATEGORY_ALREADY_EXISTS_EXCEPTION_MESSAGE = "The category you want to create already exists";
    public static final String EMPTY_FIELD_EXCEPTION_MESSAGE = "Field %s can not be empty";
    public static final String SIZE_CATEGORY_NAME_EXCEPTION_MESSAGE = "Category size is greater than 50 characters";
    public static final String SIZE_CATEGORY_DESCRIPTION_EXCEPTION_MESSAGE = "Category description size is greater than 80 characters";
    public static final String ERROR_DATA_VALIDATION = "Error in data";
}
