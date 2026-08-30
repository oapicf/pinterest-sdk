package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an &#x60;APP_INSTALL&#x60; campaign.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MobileAppPlatform {

    @JsonProperty("IOS") IOS(String.valueOf("IOS")), @JsonProperty("ANDROID") ANDROID(String.valueOf("ANDROID"));


    private String value;

    MobileAppPlatform(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MobileAppPlatform fromValue(String value) {
        for (MobileAppPlatform b : MobileAppPlatform.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



