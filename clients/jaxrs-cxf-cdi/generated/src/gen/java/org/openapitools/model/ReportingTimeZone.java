package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Specify the timezone to be applied for the reporting.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReportingTimeZone {

    @JsonProperty("PINTEREST_TIME_ZONE") PINTEREST_TIME_ZONE(String.valueOf("PINTEREST_TIME_ZONE")), @JsonProperty("AD_ACCOUNT_TIME_ZONE") AD_ACCOUNT_TIME_ZONE(String.valueOf("AD_ACCOUNT_TIME_ZONE"));


    private String value;

    ReportingTimeZone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReportingTimeZone fromValue(String value) {
        for (ReportingTimeZone b : ReportingTimeZone.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



