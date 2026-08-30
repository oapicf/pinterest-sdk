package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Audience processing status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceStatus {

    @JsonProperty("INITIALIZING") INITIALIZING(String.valueOf("INITIALIZING")), @JsonProperty("READY") READY(String.valueOf("READY")), @JsonProperty("TOO_SMALL") TOO_SMALL(String.valueOf("TOO_SMALL")), @JsonProperty("ELIGIBLE") ELIGIBLE(String.valueOf("ELIGIBLE")), @JsonProperty("PERSONAS_INELIGIBLE_SIZE") PERSONAS_INELIGIBLE_SIZE(String.valueOf("PERSONAS_INELIGIBLE_SIZE")), @JsonProperty("PERSONAS_INITIALIZING") PERSONAS_INITIALIZING(String.valueOf("PERSONAS_INITIALIZING"));


    private String value;

    AudienceStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceStatus fromValue(String value) {
        for (AudienceStatus b : AudienceStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



