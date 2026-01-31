package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Overall status of event quality score.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OverallStatusOptions {

    @JsonProperty("NEEDS_IMPROVEMENT") NEEDS_IMPROVEMENT(String.valueOf("NEEDS_IMPROVEMENT")), @JsonProperty("FAIR") FAIR(String.valueOf("FAIR")), @JsonProperty("GOOD") GOOD(String.valueOf("GOOD"));


    private String value;

    OverallStatusOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OverallStatusOptions fromValue(String value) {
        for (OverallStatusOptions b : OverallStatusOptions.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



