package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BoardPrivacyFilter {

    @JsonProperty("ALL") ALL(String.valueOf("ALL")), @JsonProperty("PUBLIC") PUBLIC(String.valueOf("PUBLIC")), @JsonProperty("PROTECTED") PROTECTED(String.valueOf("PROTECTED")), @JsonProperty("SECRET") SECRET(String.valueOf("SECRET")), @JsonProperty("PUBLIC_AND_SECRET") PUBLIC_AND_SECRET(String.valueOf("PUBLIC_AND_SECRET"));


    private String value;

    BoardPrivacyFilter(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BoardPrivacyFilter fromValue(String value) {
        for (BoardPrivacyFilter b : BoardPrivacyFilter.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



