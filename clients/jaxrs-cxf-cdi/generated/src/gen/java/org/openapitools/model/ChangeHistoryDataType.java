package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ChangeHistoryDataType {

    @JsonProperty("STRING") STRING(String.valueOf("STRING")), @JsonProperty("NUMERIC") NUMERIC(String.valueOf("NUMERIC")), @JsonProperty("MICROCURRENCY") MICROCURRENCY(String.valueOf("MICROCURRENCY")), @JsonProperty("DATE") DATE(String.valueOf("DATE")), @JsonProperty("BOOL") BOOL(String.valueOf("BOOL")), @JsonProperty("GENDER_LIST") GENDER_LIST(String.valueOf("GENDER_LIST")), @JsonProperty("AGE_BUCKET_LIST") AGE_BUCKET_LIST(String.valueOf("AGE_BUCKET_LIST")), @JsonProperty("APPTYPE_LIST") APPTYPE_LIST(String.valueOf("APPTYPE_LIST")), @JsonProperty("COUNTRY_LIST") COUNTRY_LIST(String.valueOf("COUNTRY_LIST")), @JsonProperty("LOCALE_LIST") LOCALE_LIST(String.valueOf("LOCALE_LIST"));


    private String value;

    ChangeHistoryDataType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ChangeHistoryDataType fromValue(String value) {
        for (ChangeHistoryDataType b : ChangeHistoryDataType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



