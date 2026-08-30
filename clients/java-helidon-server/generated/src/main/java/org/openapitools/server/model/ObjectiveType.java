package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
 */

public enum ObjectiveType {

    AWARENESS("AWARENESS"),
    CONSIDERATION("CONSIDERATION"),
    WEB_CONVERSION("WEB_CONVERSION"),
    CATALOG_SALES("CATALOG_SALES"),
    VIDEO_COMPLETION("VIDEO_COMPLETION"),
    SALES("SALES"),
    APP_INSTALL("APP_INSTALL"),
    CTV_CONSIDERATION("CTV_CONSIDERATION");

    private String value;

    ObjectiveType(String value) {
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
    public static ObjectiveType fromValue(String text) {
        for (ObjectiveType b : ObjectiveType.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

