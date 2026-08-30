package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * HTTP request method.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum HttpMethod {

    @JsonProperty("GET") GET(String.valueOf("GET")), @JsonProperty("HEAD") HEAD(String.valueOf("HEAD")), @JsonProperty("POST") POST(String.valueOf("POST")), @JsonProperty("PUT") PUT(String.valueOf("PUT")), @JsonProperty("DELETE") DELETE(String.valueOf("DELETE")), @JsonProperty("CONNECT") CONNECT(String.valueOf("CONNECT")), @JsonProperty("OPTIONS") OPTIONS(String.valueOf("OPTIONS")), @JsonProperty("TRACE") TRACE(String.valueOf("TRACE")), @JsonProperty("PATCH") PATCH(String.valueOf("PATCH"));


    private String value;

    HttpMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static HttpMethod fromValue(String value) {
        for (HttpMethod b : HttpMethod.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



