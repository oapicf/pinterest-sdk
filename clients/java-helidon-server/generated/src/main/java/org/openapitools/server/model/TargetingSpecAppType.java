package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets TargetingSpecAppType
 */

public enum TargetingSpecAppType {

    ANDROID_MOBILE("android_mobile"),
    ANDROID_TABLET("android_tablet"),
    IPAD("ipad"),
    IPHONE("iphone"),
    WEB("web"),
    WEB_MOBILE("web_mobile");

    private String value;

    TargetingSpecAppType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static TargetingSpecAppType fromValue(String text) {
        for (TargetingSpecAppType b : TargetingSpecAppType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

