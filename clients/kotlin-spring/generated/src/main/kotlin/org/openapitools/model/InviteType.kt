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
* The type of invite. MEMBER_INVITE invites a member to access your business assets. PARTNER_INVITE invites a partner to access your business assets. PARTNER_REQUEST requests access to a partner's business assets.
* Values: MEMBER_INVITE,PARTNER_INVITE,PARTNER_REQUEST
*/
enum class InviteType(@get:JsonValue val value: kotlin.String) {

    MEMBER_INVITE("MEMBER_INVITE"),
    PARTNER_INVITE("PARTNER_INVITE"),
    PARTNER_REQUEST("PARTNER_REQUEST");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): InviteType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'InviteType'")
        }
    }
}

