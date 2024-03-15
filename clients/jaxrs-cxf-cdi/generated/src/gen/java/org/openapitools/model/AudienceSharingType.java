package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Audience sharing type: [\&quot;CUSTOM\&quot;, \&quot;SYNDICATED\&quot;]
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceSharingType {

    @JsonProperty("CUSTOM") CUSTOM(String.valueOf("CUSTOM")), @JsonProperty("SYNDICATED") SYNDICATED(String.valueOf("SYNDICATED"));


    private String value;

    AudienceSharingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceSharingType fromValue(String value) {
        for (AudienceSharingType b : AudienceSharingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



