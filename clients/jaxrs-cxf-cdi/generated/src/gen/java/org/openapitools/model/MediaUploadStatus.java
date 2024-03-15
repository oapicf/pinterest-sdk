package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Media upload status
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MediaUploadStatus {

    @JsonProperty("registered") REGISTERED(String.valueOf("registered")), @JsonProperty("processing") PROCESSING(String.valueOf("processing")), @JsonProperty("succeeded") SUCCEEDED(String.valueOf("succeeded")), @JsonProperty("failed") FAILED(String.valueOf("failed"));


    private String value;

    MediaUploadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MediaUploadStatus fromValue(String value) {
        for (MediaUploadStatus b : MediaUploadStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



