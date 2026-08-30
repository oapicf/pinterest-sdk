package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. &#x60;CTV_CONSIDERATION&#x60; is in BETA. &#x60;WEB_SESSIONS&#x60; and &#x60;VIDEO_VIEW&#x60; objectives are deprecated. We recommend using &#x60;VIDEO_COMPLETION&#x60; as an alternative for the latter.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ObjectiveType {

    @JsonProperty("AWARENESS") AWARENESS(String.valueOf("AWARENESS")), @JsonProperty("CONSIDERATION") CONSIDERATION(String.valueOf("CONSIDERATION")), @JsonProperty("WEB_CONVERSION") WEB_CONVERSION(String.valueOf("WEB_CONVERSION")), @JsonProperty("CATALOG_SALES") CATALOG_SALES(String.valueOf("CATALOG_SALES")), @JsonProperty("VIDEO_COMPLETION") VIDEO_COMPLETION(String.valueOf("VIDEO_COMPLETION")), @JsonProperty("SALES") SALES(String.valueOf("SALES")), @JsonProperty("APP_INSTALL") APP_INSTALL(String.valueOf("APP_INSTALL")), @JsonProperty("CTV_CONSIDERATION") CTV_CONSIDERATION(String.valueOf("CTV_CONSIDERATION"));


    private String value;

    ObjectiveType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ObjectiveType fromValue(String value) {
        for (ObjectiveType b : ObjectiveType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



