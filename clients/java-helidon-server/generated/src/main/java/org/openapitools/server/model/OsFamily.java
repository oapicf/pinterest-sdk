package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Operating system family.
 */

public enum OsFamily {

    IOS("ios"),
    ANDROID("android"),
    MACOS("macos"),
    WINDOWS("windows"),
    LINUX("linux"),
    BSD("bsd"),
    OTHER("other");

    private String value;

    OsFamily(String value) {
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
    public static OsFamily fromValue(String text) {
        for (OsFamily b : OsFamily.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

