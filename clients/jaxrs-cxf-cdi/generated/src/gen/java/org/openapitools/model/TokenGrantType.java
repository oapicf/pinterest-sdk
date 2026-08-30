package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The type of OAuth grant being requested.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum TokenGrantType {

    @JsonProperty("authorization_code") AUTHORIZATION_CODE(String.valueOf("authorization_code")), @JsonProperty("refresh_token") REFRESH_TOKEN(String.valueOf("refresh_token")), @JsonProperty("client_credentials") CLIENT_CREDENTIALS(String.valueOf("client_credentials"));


    private String value;

    TokenGrantType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static TokenGrantType fromValue(String value) {
        for (TokenGrantType b : TokenGrantType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



