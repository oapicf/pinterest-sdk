package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of conversion events ingestion
 */

public enum CreationSource {

    ADS_API("ADS_API"),
    ADS_MANAGER_REPORTING_PAGE("ADS_MANAGER_REPORTING_PAGE"),
    ADS_MANAGER_REPORT_BUILDER("ADS_MANAGER_REPORT_BUILDER");

    private String value;

    CreationSource(String value) {
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
    public static CreationSource fromValue(String text) {
        for (CreationSource b : CreationSource.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

