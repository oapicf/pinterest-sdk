package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * List of verticals for product categories.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum VerticalProductCategory {

    @JsonProperty("FASHION") FASHION(String.valueOf("FASHION")), @JsonProperty("HOME_DECOR") HOME_DECOR(String.valueOf("HOME_DECOR")), @JsonProperty("BEAUTY") BEAUTY(String.valueOf("BEAUTY"));


    private String value;

    VerticalProductCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static VerticalProductCategory fromValue(String value) {
        for (VerticalProductCategory b : VerticalProductCategory.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



