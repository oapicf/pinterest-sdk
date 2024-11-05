package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The current status of the invite.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum InviteStatus {

    @JsonProperty("PENDING") PENDING(String.valueOf("PENDING")), @JsonProperty("ACCEPTED") ACCEPTED(String.valueOf("ACCEPTED")), @JsonProperty("DECLINED") DECLINED(String.valueOf("DECLINED")), @JsonProperty("CANCELLED") CANCELLED(String.valueOf("CANCELLED")), @JsonProperty("EXPIRED") EXPIRED(String.valueOf("EXPIRED"));


    private String value;

    InviteStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InviteStatus fromValue(String value) {
        for (InviteStatus b : InviteStatus.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



