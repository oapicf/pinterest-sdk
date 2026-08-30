package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Attribution model used to attribute the conversion event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttributionModel {

    @JsonProperty("first_touch") FIRST_TOUCH(String.valueOf("first_touch")), @JsonProperty("last_touch") LAST_TOUCH(String.valueOf("last_touch")), @JsonProperty("multi_touch") MULTI_TOUCH(String.valueOf("multi_touch")), @JsonProperty("mmm") MMM(String.valueOf("mmm"));


    private String value;

    AttributionModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AttributionModel fromValue(String value) {
        for (AttributionModel b : AttributionModel.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



