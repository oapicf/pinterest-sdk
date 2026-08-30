package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
* Values: EMPLOYEE,BIZ_ADMIN,PARTNER
*/
enum class BusinessRoleForInvite(@get:JsonValue val value: kotlin.String) {

    EMPLOYEE("EMPLOYEE"),
    BIZ_ADMIN("BIZ_ADMIN"),
    PARTNER("PARTNER");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): BusinessRoleForInvite {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BusinessRoleForInvite'")
        }
    }
}

