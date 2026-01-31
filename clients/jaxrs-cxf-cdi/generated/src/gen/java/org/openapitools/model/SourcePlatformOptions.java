package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * List of source platforms for a conversion event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum SourcePlatformOptions {

    @JsonProperty("WEB") WEB(String.valueOf("WEB")), @JsonProperty("MOBILE") MOBILE(String.valueOf("MOBILE")), @JsonProperty("MOBILE_ANDROID") MOBILE_ANDROID(String.valueOf("MOBILE_ANDROID")), @JsonProperty("MOBILE_IOS") MOBILE_IOS(String.valueOf("MOBILE_IOS")), @JsonProperty("OFFLINE") OFFLINE(String.valueOf("OFFLINE")), @JsonProperty("PINTEREST_WEB") PINTEREST_WEB(String.valueOf("PINTEREST_WEB")), @JsonProperty("PINTEREST_ANDROID") PINTEREST_ANDROID(String.valueOf("PINTEREST_ANDROID")), @JsonProperty("PINTEREST_IOS") PINTEREST_IOS(String.valueOf("PINTEREST_IOS")), @JsonProperty("POINT_OF_SALE") POINT_OF_SALE(String.valueOf("POINT_OF_SALE"));


    private String value;

    SourcePlatformOptions(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static SourcePlatformOptions fromValue(String value) {
        for (SourcePlatformOptions b : SourcePlatformOptions.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



