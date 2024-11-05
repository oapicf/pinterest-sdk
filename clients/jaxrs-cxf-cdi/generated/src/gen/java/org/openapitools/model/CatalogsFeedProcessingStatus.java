package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsFeedProcessingStatus {

    @JsonProperty("COMPLETED") COMPLETED(String.valueOf("COMPLETED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED")), @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING"));


    private String value;

    CatalogsFeedProcessingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static CatalogsFeedProcessingStatus fromValue(String value) {
        for (CatalogsFeedProcessingStatus b : CatalogsFeedProcessingStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



