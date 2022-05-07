package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Attribution type. Refers to the Pinterest Tag endpoints
 **/

public enum ConversionReportAttributionType {

    INDIVIDUAL(String.valueOf("INDIVIDUAL")), HOUSEHOLD(String.valueOf("HOUSEHOLD"));


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



