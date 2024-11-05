package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum BusinessRoleForMembers {

    @JsonProperty("EMPLOYEE") EMPLOYEE(String.valueOf("EMPLOYEE")), @JsonProperty("BIZ_ADMIN") BIZ_ADMIN(String.valueOf("BIZ_ADMIN"));


    private String value;

    BusinessRoleForMembers(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessRoleForMembers fromValue(String value) {
        for (BusinessRoleForMembers b : BusinessRoleForMembers.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



