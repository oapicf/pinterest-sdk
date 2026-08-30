package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Platform options for AppsFlyer audience
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum AppsflyerPlatform {

    @JsonProperty("android") ANDROID(String.valueOf("android")), @JsonProperty("ios") IOS(String.valueOf("ios"));


    private String value;

    AppsflyerPlatform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AppsflyerPlatform fromValue(String value) {
        for (AppsflyerPlatform b : AppsflyerPlatform.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



