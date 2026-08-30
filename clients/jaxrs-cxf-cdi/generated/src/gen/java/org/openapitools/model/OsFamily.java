package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Operating system family.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OsFamily {

    @JsonProperty("ios") IOS(String.valueOf("ios")), @JsonProperty("android") ANDROID(String.valueOf("android")), @JsonProperty("macos") MACOS(String.valueOf("macos")), @JsonProperty("windows") WINDOWS(String.valueOf("windows")), @JsonProperty("linux") LINUX(String.valueOf("linux")), @JsonProperty("bsd") BSD(String.valueOf("bsd")), @JsonProperty("other") OTHER(String.valueOf("other"));


    private String value;

    OsFamily(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OsFamily fromValue(String value) {
        for (OsFamily b : OsFamily.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



