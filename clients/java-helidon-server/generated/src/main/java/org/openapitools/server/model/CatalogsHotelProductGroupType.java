package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Catalog hotel product group type
 */

public enum CatalogsHotelProductGroupType {

    MERCHANT_CREATED("MERCHANT_CREATED"),
    ALL_LISTINGS("ALL_LISTINGS");

    private String value;

    CatalogsHotelProductGroupType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static CatalogsHotelProductGroupType fromValue(String text) {
        for (CatalogsHotelProductGroupType b : CatalogsHotelProductGroupType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

