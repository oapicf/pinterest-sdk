package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion product attribution level
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionProductAttributionType {

    @JsonProperty("DEFAULT") DEFAULT(String.valueOf("DEFAULT")), @JsonProperty("BRAND_ATTRIBUTION") BRAND_ATTRIBUTION(String.valueOf("BRAND_ATTRIBUTION"));


    private String value;

    ConversionProductAttributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionProductAttributionType fromValue(String value) {
        for (ConversionProductAttributionType b : ConversionProductAttributionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



