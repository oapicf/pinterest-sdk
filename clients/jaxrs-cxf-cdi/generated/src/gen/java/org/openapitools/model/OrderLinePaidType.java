package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Order Line Paid Type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderLinePaidType {

    @JsonProperty("PAID") PAID(String.valueOf("PAID")), @JsonProperty("BONUS") BONUS(String.valueOf("BONUS")), @JsonProperty("MAKE_GOOD") MAKE_GOOD(String.valueOf("MAKE_GOOD")), @JsonProperty("TEST") TEST(String.valueOf("TEST")), @JsonProperty("null") NULL(String.valueOf("null"));


    private String value;

    OrderLinePaidType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderLinePaidType fromValue(String value) {
        for (OrderLinePaidType b : OrderLinePaidType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



