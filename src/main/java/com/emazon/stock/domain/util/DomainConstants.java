package com.emazon.stock.domain.util;

public class DomainConstants {

    private DomainConstants(){
        throw new IllegalStateException("Utility class");
    }

    public enum Field {
        NAME,
        DESCRIPTION
    }

    public static final String FIELD_CATEGORY_NAME_NULL_MESSAGE = "Field 'name' cannot be null";
    public static final String FIELD_CATEGORY_NAME_REPEAT_MESSAGE = "Field 'name' cannot be repeated";
    public static final String FIELD_CATEGORY_NAME_SIZE_MESSAGE = "Field 'name' cannot be less than 50 characters";
    public static final String FIELD_CATEGORY_DESCRIPTION_NULL_MESSAGE = "Field 'description' cannot be null";
    public static final String FIELD_CATEGORY_DESCRIPTION_SIZE_MESSAGE = "Field 'description' cannot be less than 90 characters";
    public static final String FIELD_BRAND_NAME_NULL_MESSAGE = "Field 'name' cannot be null";
    public static final String FIELD_BRAND_NAME_REPEAT_MESSAGE = "Field 'name' cannot be repeated";
    public static final String FIELD_BRAND_NAME_SIZE_MESSAGE = "Field 'name' cannot be less than 50 characters";
    public static final String FIELD_BRAND_DESCRIPTION_NULL_MESSAGE = "Field 'description' cannot be null";
    public static final String FIELD_BRAND_DESCRIPTION_SIZE_MESSAGE = "Field 'description' cannot be less than 120 characters";
    public static final Integer CATEGORY_NAME_MAX_SIZE = 50;
    public static final Integer CATEGORY_DESCRIPTION_MAX_SIZE = 90;
    public static final Integer BRAND_NAME_MAX_SIZE = 50;
    public static final Integer BRAND_DESCRIPTION_MAX_SIZE = 120;
}
