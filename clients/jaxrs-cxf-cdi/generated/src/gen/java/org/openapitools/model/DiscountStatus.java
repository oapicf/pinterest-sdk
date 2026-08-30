package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Discount status based on the current time and start and end time of discount
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum DiscountStatus {

    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")), @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE")), @JsonProperty("PAUSED") PAUSED(String.valueOf("PAUSED")), @JsonProperty("SCHEDULED") SCHEDULED(String.valueOf("SCHEDULED")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    DiscountStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static DiscountStatus fromValue(String value) {
        for (DiscountStatus b : DiscountStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



