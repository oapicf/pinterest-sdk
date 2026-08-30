package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Invite statuses used for filters.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum InviteFilterStatus {

    @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    InviteFilterStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InviteFilterStatus fromValue(String value) {
        for (InviteFilterStatus b : InviteFilterStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



