package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Status of the lead form
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LeadFormStatus {

    @JsonProperty("DRAFT") DRAFT(String.valueOf("DRAFT")), @JsonProperty("ACTIVE") ACTIVE(String.valueOf("ACTIVE"));


    private String value;

    LeadFormStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LeadFormStatus fromValue(String value) {
        for (LeadFormStatus b : LeadFormStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



