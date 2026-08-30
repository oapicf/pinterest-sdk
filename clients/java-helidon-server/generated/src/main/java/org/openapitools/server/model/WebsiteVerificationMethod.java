package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Method used to verify website ownership.
 */

public enum WebsiteVerificationMethod {

    FILENAME("FILENAME"),
    METATAG("METATAG"),
    DNSTXT("DNSTXT");

    private String value;

    WebsiteVerificationMethod(String value) {
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
    public static WebsiteVerificationMethod fromValue(String text) {
        for (WebsiteVerificationMethod b : WebsiteVerificationMethod.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

