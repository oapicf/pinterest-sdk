package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner&#39;s business assets.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum InviteType {

    @JsonProperty("MEMBER_INVITE") MEMBER_INVITE(String.valueOf("MEMBER_INVITE")), @JsonProperty("PARTNER_INVITE") PARTNER_INVITE(String.valueOf("PARTNER_INVITE")), @JsonProperty("PARTNER_REQUEST") PARTNER_REQUEST(String.valueOf("PARTNER_REQUEST"));


    private String value;

    InviteType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static InviteType fromValue(String value) {
        for (InviteType b : InviteType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



