package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BusinessRoleForInvite {

    @JsonProperty("EMPLOYEE") EMPLOYEE(String.valueOf("EMPLOYEE")), @JsonProperty("BIZ_ADMIN") BIZ_ADMIN(String.valueOf("BIZ_ADMIN")), @JsonProperty("PARTNER") PARTNER(String.valueOf("PARTNER"));


    private String value;

    BusinessRoleForInvite(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessRoleForInvite fromValue(String value) {
        for (BusinessRoleForInvite b : BusinessRoleForInvite.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



