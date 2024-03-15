package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceInsightType {

    @JsonProperty("YOUR_TOTAL_AUDIENCE") YOUR_TOTAL_AUDIENCE(String.valueOf("YOUR_TOTAL_AUDIENCE")), @JsonProperty("YOUR_ENGAGED_AUDIENCE") YOUR_ENGAGED_AUDIENCE(String.valueOf("YOUR_ENGAGED_AUDIENCE")), @JsonProperty("PINTEREST_TOTAL_AUDIENCE") PINTEREST_TOTAL_AUDIENCE(String.valueOf("PINTEREST_TOTAL_AUDIENCE"));


    private String value;

    AudienceInsightType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceInsightType fromValue(String value) {
        for (AudienceInsightType b : AudienceInsightType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



