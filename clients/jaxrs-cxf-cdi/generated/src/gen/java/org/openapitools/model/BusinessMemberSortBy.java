package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The name of field that businesses are sorted by
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BusinessMemberSortBy {

    @JsonProperty("FULL_NAME") FULL_NAME(String.valueOf("FULL_NAME")), @JsonProperty("BUSINESS_ROLES") BUSINESS_ROLES(String.valueOf("BUSINESS_ROLES")), @JsonProperty("CREATED_TIME") CREATED_TIME(String.valueOf("CREATED_TIME"));


    private String value;

    BusinessMemberSortBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessMemberSortBy fromValue(String value) {
        for (BusinessMemberSortBy b : BusinessMemberSortBy.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



