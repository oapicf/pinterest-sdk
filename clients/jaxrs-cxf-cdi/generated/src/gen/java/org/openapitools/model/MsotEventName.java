package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Type of user conversion event.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MsotEventName {

    @JsonProperty("add_to_cart") ADD_TO_CART(String.valueOf("add_to_cart")), @JsonProperty("checkout") CHECKOUT(String.valueOf("checkout")), @JsonProperty("lead") LEAD(String.valueOf("lead")), @JsonProperty("signup") SIGNUP(String.valueOf("signup"));


    private String value;

    MsotEventName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MsotEventName fromValue(String value) {
        for (MsotEventName b : MsotEventName.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



