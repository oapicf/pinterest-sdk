package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionReportAttributionType {

    @JsonProperty("INDIVIDUAL") INDIVIDUAL(String.valueOf("INDIVIDUAL")), @JsonProperty("HOUSEHOLD") HOUSEHOLD(String.valueOf("HOUSEHOLD"));


    private String value;

    ConversionReportAttributionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionReportAttributionType fromValue(String value) {
        for (ConversionReportAttributionType b : ConversionReportAttributionType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



