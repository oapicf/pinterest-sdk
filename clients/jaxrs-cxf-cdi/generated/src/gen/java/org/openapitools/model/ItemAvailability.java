package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Availability of the item
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ItemAvailability {

    @JsonProperty("in stock") IN_STOCK(String.valueOf("in stock")), @JsonProperty("out of stock") OUT_OF_STOCK(String.valueOf("out of stock")), @JsonProperty("preorder") PREORDER(String.valueOf("preorder"));


    private String value;

    ItemAvailability(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ItemAvailability fromValue(String value) {
        for (ItemAvailability b : ItemAvailability.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



