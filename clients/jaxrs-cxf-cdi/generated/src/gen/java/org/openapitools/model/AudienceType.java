package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Audience type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AudienceType {

    @JsonProperty("CUSTOMER_LIST") CUSTOMER_LIST(String.valueOf("CUSTOMER_LIST")), @JsonProperty("VISITOR") VISITOR(String.valueOf("VISITOR")), @JsonProperty("ENGAGEMENT") ENGAGEMENT(String.valueOf("ENGAGEMENT")), @JsonProperty("ACTALIKE") ACTALIKE(String.valueOf("ACTALIKE")), @JsonProperty("PERSONA") PERSONA(String.valueOf("PERSONA"));


    private String value;

    AudienceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AudienceType fromValue(String value) {
        for (AudienceType b : AudienceType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



