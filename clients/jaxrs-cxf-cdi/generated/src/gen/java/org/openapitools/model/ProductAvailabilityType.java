package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Default availability for products in a feed.
 **/

public enum ProductAvailabilityType {

    IN_STOCK(String.valueOf("IN_STOCK")), OUT_OF_STOCK(String.valueOf("OUT_OF_STOCK")), PREORDER(String.valueOf("PREORDER")), NULL(String.valueOf("null"));


    private String value;

    ProductAvailabilityType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ProductAvailabilityType fromValue(String value) {
        for (ProductAvailabilityType b : ProductAvailabilityType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



