package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets ChangeHistoryDataType
 */

public enum ChangeHistoryDataType {

    STRING("STRING"),
    NUMERIC("NUMERIC"),
    MICROCURRENCY("MICROCURRENCY"),
    DATE("DATE"),
    BOOL("BOOL"),
    GENDER_LIST("GENDER_LIST"),
    AGE_BUCKET_LIST("AGE_BUCKET_LIST"),
    APPTYPE_LIST("APPTYPE_LIST"),
    COUNTRY_LIST("COUNTRY_LIST"),
    LOCALE_LIST("LOCALE_LIST");

    private String value;

    ChangeHistoryDataType(String value) {
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
    public static ChangeHistoryDataType fromValue(String text) {
        for (ChangeHistoryDataType b : ChangeHistoryDataType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

