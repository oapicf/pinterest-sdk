package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TargetingSpecAppType {

    @JsonProperty("android_mobile") ANDROID_MOBILE(String.valueOf("android_mobile")), @JsonProperty("android_tablet") ANDROID_TABLET(String.valueOf("android_tablet")), @JsonProperty("ipad") IPAD(String.valueOf("ipad")), @JsonProperty("iphone") IPHONE(String.valueOf("iphone")), @JsonProperty("web") WEB(String.valueOf("web")), @JsonProperty("web_mobile") WEB_MOBILE(String.valueOf("web_mobile"));


    private String value;

    TargetingSpecAppType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TargetingSpecAppType fromValue(String value) {
        for (TargetingSpecAppType b : TargetingSpecAppType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



