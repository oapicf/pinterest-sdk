package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Objective for engagement audience filter. Used only on ad account audience rule; matches baseline ObjectiveType (no VIDEO_VIEW, WEB_SESSIONS).
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceObjectiveType {

    @JsonProperty("AWARENESS") AWARENESS(String.valueOf("AWARENESS")), @JsonProperty("CONSIDERATION") CONSIDERATION(String.valueOf("CONSIDERATION")), @JsonProperty("WEB_CONVERSION") WEB_CONVERSION(String.valueOf("WEB_CONVERSION")), @JsonProperty("CATALOG_SALES") CATALOG_SALES(String.valueOf("CATALOG_SALES")), @JsonProperty("VIDEO_COMPLETION") VIDEO_COMPLETION(String.valueOf("VIDEO_COMPLETION")), @JsonProperty("SALES") SALES(String.valueOf("SALES"));


    private String value;

    AudienceObjectiveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceObjectiveType fromValue(String value) {
        for (AudienceObjectiveType b : AudienceObjectiveType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



