package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * User list operation type (add or remove)
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserListOperationType {

    @JsonProperty("ADD") ADD(String.valueOf("ADD")), @JsonProperty("REMOVE") REMOVE(String.valueOf("REMOVE"));


    private String value;

    UserListOperationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserListOperationType fromValue(String value) {
        for (UserListOperationType b : UserListOperationType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



