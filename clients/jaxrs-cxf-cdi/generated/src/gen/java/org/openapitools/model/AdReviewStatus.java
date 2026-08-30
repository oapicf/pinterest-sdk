package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ad review status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdReviewStatus {

    @JsonProperty("OTHER") OTHER(String.valueOf("OTHER")), @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("REJECTED") REJECTED(String.valueOf("REJECTED")), @JsonProperty("APPROVED") APPROVED(String.valueOf("APPROVED"));


    private String value;

    AdReviewStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdReviewStatus fromValue(String value) {
        for (AdReviewStatus b : AdReviewStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



