package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Conversion report time type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionReportTimeType {

    @JsonProperty("TIME_OF_AD_ACTION") AD_ACTION(String.valueOf("TIME_OF_AD_ACTION")), @JsonProperty("TIME_OF_CONVERSION") CONVERSION(String.valueOf("TIME_OF_CONVERSION"));


    private String value;

    ConversionReportTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionReportTimeType fromValue(String value) {
        for (ConversionReportTimeType b : ConversionReportTimeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



