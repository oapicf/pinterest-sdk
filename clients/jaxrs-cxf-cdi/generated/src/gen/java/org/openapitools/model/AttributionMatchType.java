package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Match type for an attributed event. P for probabilistic, D for deterministic, NA for Not applicable.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttributionMatchType {

    @JsonProperty("P") P(String.valueOf("P")), @JsonProperty("D") D(String.valueOf("D")), @JsonProperty("NA") NA(String.valueOf("NA"));


    private String value;

    AttributionMatchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AttributionMatchType fromValue(String value) {
        for (AttributionMatchType b : AttributionMatchType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



