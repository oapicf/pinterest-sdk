package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Ad group pacing delivery type
 **/

public enum PacingDeliveryType {

    STANDARD(String.valueOf("STANDARD")), ACCELERATED(String.valueOf("ACCELERATED"));


    private String value;

    PacingDeliveryType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PacingDeliveryType fromValue(String value) {
        for (PacingDeliveryType b : PacingDeliveryType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



