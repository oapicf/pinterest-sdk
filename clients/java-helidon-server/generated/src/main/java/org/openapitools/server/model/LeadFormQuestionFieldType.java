package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Lead form question field type
 */

public enum LeadFormQuestionFieldType {

    TEXT_FIELD("TEXT_FIELD"),
    TEXT_AREA("TEXT_AREA"),
    RADIO_LIST("RADIO_LIST"),
    CHECKBOX("CHECKBOX");

    private String value;

    LeadFormQuestionFieldType(String value) {
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
    public static LeadFormQuestionFieldType fromValue(String text) {
        for (LeadFormQuestionFieldType b : LeadFormQuestionFieldType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

