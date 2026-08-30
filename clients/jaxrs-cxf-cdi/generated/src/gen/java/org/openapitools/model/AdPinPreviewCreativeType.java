package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AdPinPreviewCreativeType {

    @JsonProperty("SHOPPING") SHOPPING(String.valueOf("SHOPPING")), @JsonProperty("COLLECTION") COLLECTION(String.valueOf("COLLECTION")), @JsonProperty("MAX_VIDEO") MAX_VIDEO(String.valueOf("MAX_VIDEO")), @JsonProperty("MAX_WIDTH_VIDEO_COLLECTION") MAX_WIDTH_VIDEO_COLLECTION(String.valueOf("MAX_WIDTH_VIDEO_COLLECTION")), @JsonProperty("MAX_WIDTH_REGULAR_COLLECTION") MAX_WIDTH_REGULAR_COLLECTION(String.valueOf("MAX_WIDTH_REGULAR_COLLECTION"));


    private String value;

    AdPinPreviewCreativeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AdPinPreviewCreativeType fromValue(String value) {
        for (AdPinPreviewCreativeType b : AdPinPreviewCreativeType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



