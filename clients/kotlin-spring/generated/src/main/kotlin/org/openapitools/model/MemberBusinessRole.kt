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
* The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
* Values: EMPLOYEE,BIZ_ADMIN
*/
enum class MemberBusinessRole(@get:JsonValue val value: kotlin.String) {

    EMPLOYEE("EMPLOYEE"),
    BIZ_ADMIN("BIZ_ADMIN");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): MemberBusinessRole {
                return values().first{it -> it.value == value}
        }
    }
}

