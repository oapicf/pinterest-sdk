package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Device form factor
 */

public enum FormFactor {

    DESKTOP("desktop"),
    LAPTOP("laptop"),
    CELLPHONE("cellphone"),
    TABLET("tablet"),
    SMARTWATCH("smartwatch"),
    TV("tv"),
    VR("vr"),
    CONSOLE("console"),
    OTHER("other");

    private String value;

    FormFactor(String value) {
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
    public static FormFactor fromValue(String text) {
        for (FormFactor b : FormFactor.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

