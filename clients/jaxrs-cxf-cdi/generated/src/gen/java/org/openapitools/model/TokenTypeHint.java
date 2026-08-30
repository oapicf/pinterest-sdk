package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The type of token to revoke.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TokenTypeHint {

    @JsonProperty("access_token") ACCESS_TOKEN(String.valueOf("access_token")), @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token"));


    private String value;

    TokenTypeHint(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TokenTypeHint fromValue(String value) {
        for (TokenTypeHint b : TokenTypeHint.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



