package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Objective type for delivery estimates.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DeliveryEstimateObjectiveType {

    @JsonProperty("AWARENESS") AWARENESS(String.valueOf("AWARENESS")), @JsonProperty("CONSIDERATION") CONSIDERATION(String.valueOf("CONSIDERATION")), @JsonProperty("CATALOG_SALES") CATALOG_SALES(String.valueOf("CATALOG_SALES")), @JsonProperty("WEB_CONVERSION") WEB_CONVERSION(String.valueOf("WEB_CONVERSION"));


    private String value;

    DeliveryEstimateObjectiveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DeliveryEstimateObjectiveType fromValue(String value) {
        for (DeliveryEstimateObjectiveType b : DeliveryEstimateObjectiveType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



