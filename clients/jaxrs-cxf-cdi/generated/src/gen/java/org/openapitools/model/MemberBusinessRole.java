package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * The access level a member/partner has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum MemberBusinessRole {

    @JsonProperty("EMPLOYEE") EMPLOYEE(String.valueOf("EMPLOYEE")), @JsonProperty("BIZ_ADMIN") BIZ_ADMIN(String.valueOf("BIZ_ADMIN"));


    private String value;

    MemberBusinessRole(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static MemberBusinessRole fromValue(String value) {
        for (MemberBusinessRole b : MemberBusinessRole.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



