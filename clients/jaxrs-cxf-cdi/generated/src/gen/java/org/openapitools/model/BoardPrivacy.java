package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BoardPrivacy {

    @JsonProperty("PUBLIC") PUBLIC(String.valueOf("PUBLIC")), @JsonProperty("PROTECTED") PROTECTED(String.valueOf("PROTECTED")), @JsonProperty("SECRET") SECRET(String.valueOf("SECRET"));


    private String value;

    BoardPrivacy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BoardPrivacy fromValue(String value) {
        for (BoardPrivacy b : BoardPrivacy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



