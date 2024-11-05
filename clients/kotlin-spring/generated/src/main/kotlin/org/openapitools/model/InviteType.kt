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
* The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets.
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
                return values().first{it -> it.value == value}
        }
    }
}

