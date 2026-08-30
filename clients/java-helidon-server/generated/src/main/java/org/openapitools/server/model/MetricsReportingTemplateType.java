package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Reporting template type
 */

public enum MetricsReportingTemplateType {

    UNSPECIFIED("UNSPECIFIED"),
    BULK("BULK"),
    OVERVIEW("OVERVIEW"),
    TABLE("TABLE"),
    MMM("MMM"),
    BRAND_CATEGORY("BRAND_CATEGORY");

    private String value;

    MetricsReportingTemplateType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static MetricsReportingTemplateType fromValue(String text) {
        for (MetricsReportingTemplateType b : MetricsReportingTemplateType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

