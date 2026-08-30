package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 */

public enum BusinessRoleForMembers {

    EMPLOYEE("EMPLOYEE"),
    BIZ_ADMIN("BIZ_ADMIN");

    private String value;

    BusinessRoleForMembers(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @JsonCreator
    public static BusinessRoleForMembers fromValue(String text) {
        for (BusinessRoleForMembers b : BusinessRoleForMembers.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + text + "'");
    }
}

