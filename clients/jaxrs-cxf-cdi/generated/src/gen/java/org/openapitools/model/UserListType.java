package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * User list type
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum UserListType {

    @JsonProperty("EMAIL") EMAIL(String.valueOf("EMAIL")), @JsonProperty("IDFA") IDFA(String.valueOf("IDFA")), @JsonProperty("MAID") MAID(String.valueOf("MAID")), @JsonProperty("LR_ID") LR_ID(String.valueOf("LR_ID")), @JsonProperty("DLX_ID") DLX_ID(String.valueOf("DLX_ID")), @JsonProperty("HASHED_PINNER_ID") HASHED_PINNER_ID(String.valueOf("HASHED_PINNER_ID"));


    private String value;

    UserListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UserListType fromValue(String value) {
        for (UserListType b : UserListType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



