package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Represents the status of the conversion deletion request. \&quot;PENDING\&quot; or \&quot;SUBMITTED\&quot;. \&quot;PENDING\&quot; meaning the Advertiser can cancel the request. The advertiser has a 7 day time window after the conversion deletion request was submitted to cancel it. \&quot;SUBMITTED\&quot; meaning that the Data Deletion process has begun and can no longer be canceled.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ConversionDeletionRequestStatus {

    @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("SUBMITTED") SUBMITTED(String.valueOf("SUBMITTED")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED"));


    private String value;

    ConversionDeletionRequestStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ConversionDeletionRequestStatus fromValue(String value) {
        for (ConversionDeletionRequestStatus b : ConversionDeletionRequestStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



