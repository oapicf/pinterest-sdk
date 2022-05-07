package org.openapitools.model;

import javax.validation.constraints.*;


public enum MediaUploadType {

    VIDEO(String.valueOf("video"));


    private String value;

    MediaUploadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MediaUploadType fromValue(String value) {
        for (MediaUploadType b : MediaUploadType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



