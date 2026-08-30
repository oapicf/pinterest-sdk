package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Catalog hotel product group type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsHotelProductGroupType {

    @JsonProperty("MERCHANT_CREATED") MERCHANT_CREATED(String.valueOf("MERCHANT_CREATED")), @JsonProperty("ALL_LISTINGS") ALL_LISTINGS(String.valueOf("ALL_LISTINGS"));


    private String value;

    CatalogsHotelProductGroupType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsHotelProductGroupType fromValue(String value) {
        for (CatalogsHotelProductGroupType b : CatalogsHotelProductGroupType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



