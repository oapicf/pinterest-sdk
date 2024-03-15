package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Lead form question field type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum LeadFormQuestionFieldType {

    @JsonProperty("TEXT_FIELD") TEXT_FIELD(String.valueOf("TEXT_FIELD")), @JsonProperty("TEXT_AREA") TEXT_AREA(String.valueOf("TEXT_AREA")), @JsonProperty("RADIO_LIST") RADIO_LIST(String.valueOf("RADIO_LIST")), @JsonProperty("CHECKBOX") CHECKBOX(String.valueOf("CHECKBOX")), @JsonProperty("null") NULL(String.valueOf("null"));


    private String value;

    LeadFormQuestionFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static LeadFormQuestionFieldType fromValue(String value) {
        for (LeadFormQuestionFieldType b : LeadFormQuestionFieldType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        return null;
    }
}



