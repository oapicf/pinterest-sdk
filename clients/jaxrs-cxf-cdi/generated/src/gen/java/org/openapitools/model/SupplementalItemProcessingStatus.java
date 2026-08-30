package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The status of the item processing record
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum SupplementalItemProcessingStatus {

    @JsonProperty("SUCCESS") SUCCESS(String.valueOf("SUCCESS")), @JsonProperty("FAILURE") FAILURE(String.valueOf("FAILURE")), @JsonProperty("PROCESSING") PROCESSING(String.valueOf("PROCESSING"));


    private String value;

    SupplementalItemProcessingStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SupplementalItemProcessingStatus fromValue(String value) {
        for (SupplementalItemProcessingStatus b : SupplementalItemProcessingStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



