package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ad targeting types for MMM report
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MMMReportingTargetingType {

    @JsonProperty("APPTYPE") APPTYPE(String.valueOf("APPTYPE")), @JsonProperty("COUNTRY") COUNTRY(String.valueOf("COUNTRY")), @JsonProperty("CREATIVE_TYPE") CREATIVE_TYPE(String.valueOf("CREATIVE_TYPE")), @JsonProperty("GENDER") GENDER(String.valueOf("GENDER")), @JsonProperty("LOCATION") LOCATION(String.valueOf("LOCATION"));


    private String value;

    MMMReportingTargetingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MMMReportingTargetingType fromValue(String value) {
        for (MMMReportingTargetingType b : MMMReportingTargetingType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



