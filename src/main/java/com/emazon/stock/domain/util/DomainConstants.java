package com.emazon.stock.domain.util;

public class DomainConstants {

    private DomainConstants(){
        throw new IllegalStateException("Utility class");
    }

    public enum Field {
        NAME,
        DESCRIPTION
    }

    public static final String FIELD_NAME_NULL_MESSAGE = "Field 'name' cannot be null";
    public static final String FIELD_NAME_REPEAT_MESSAGE = "Field 'name' cannot be repeated";
    public static final String FIELD_NAME_SIZE_MESSAGE = "Field 'name' cannot be less than 50 characters";
    public static final String FIELD_DESCRIPTION_NULL_MESSAGE = "Field 'description' cannot be null";
    public static final String FIELD_DESCRIPTION_SIZE_MESSAGE = "Field 'description' cannot be less than 90 characters";


}
