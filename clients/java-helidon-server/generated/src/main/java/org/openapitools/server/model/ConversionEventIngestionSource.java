package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The source of conversion events ingestion
 */

public enum ConversionEventIngestionSource {

    TAG("TAG"),
    MMP("MMP"),
    FILE_UPLOAD("FILE_UPLOAD"),
    CONVERSIONS_API("CONVERSIONS_API"),
    NATIVE("NATIVE");

    private String value;

    ConversionEventIngestionSource(String value) {
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
    public static ConversionEventIngestionSource fromValue(String text) {
        for (ConversionEventIngestionSource b : ConversionEventIngestionSource.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

