package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * &lt;p&gt;Catalog hotel product group type&lt;/p&gt; &lt;p&gt;MERCHANT_CREATED: Product groups created by merchants. &lt;br&gt;ALL_LISTINGS: Includes every hotel item in your catalog.
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



