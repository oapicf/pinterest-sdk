package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ad event type used for attribution.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttributionScope {

    @JsonProperty("view") VIEW(String.valueOf("view")), @JsonProperty("engagement") ENGAGEMENT(String.valueOf("engagement")), @JsonProperty("click") CLICK(String.valueOf("click"));


    private String value;

    AttributionScope(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AttributionScope fromValue(String value) {
        for (AttributionScope b : AttributionScope.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



