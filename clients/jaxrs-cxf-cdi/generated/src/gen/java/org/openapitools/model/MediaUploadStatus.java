package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Media upload status
 **/

public enum MediaUploadStatus {

    REGISTERED(String.valueOf("registered")), PROCESSING(String.valueOf("processing")), SUCCEEDED(String.valueOf("succeeded")), FAILED(String.valueOf("failed"));


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



