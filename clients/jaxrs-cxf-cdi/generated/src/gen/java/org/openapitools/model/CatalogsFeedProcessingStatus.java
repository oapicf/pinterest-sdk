package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum CatalogsFeedProcessingStatus {

    @JsonProperty("COMPLETED") COMPLETED(String.valueOf("COMPLETED")), @JsonProperty("COMPLETED_EARLY") COMPLETED_EARLY(String.valueOf("COMPLETED_EARLY")), @JsonProperty("DISAPPROVED") DISAPPROVED(String.valueOf("DISAPPROVED")), @JsonProperty("FAILED") FAILED(String.valueOf("FAILED")), @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING")), @JsonProperty("QUEUED_FOR_PROCESSING") QUEUED_FOR_PROCESSING(String.valueOf("QUEUED_FOR_PROCESSING")), @JsonProperty("UNDER_APPEAL") UNDER_APPEAL(String.valueOf("UNDER_APPEAL")), @JsonProperty("UNDER_REVIEW") UNDER_REVIEW(String.valueOf("UNDER_REVIEW"));


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



