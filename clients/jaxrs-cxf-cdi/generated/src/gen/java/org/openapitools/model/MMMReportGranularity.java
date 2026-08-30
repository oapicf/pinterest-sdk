package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MMMReportGranularity {

    @JsonProperty("DAY") DAY(String.valueOf("DAY")), @JsonProperty("WEEK") WEEK(String.valueOf("WEEK"));


    private String value;

    MMMReportGranularity(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MMMReportGranularity fromValue(String value) {
        for (MMMReportGranularity b : MMMReportGranularity.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



