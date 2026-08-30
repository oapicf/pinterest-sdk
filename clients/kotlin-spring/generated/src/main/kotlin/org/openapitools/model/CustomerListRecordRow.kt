package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * A single row in a multi-field customer list (v2 format).
 * @param email Email address (plain or hashed with SHA1, SHA256, or MD5).
 * @param externalId External ID identifier (not hashed).
 * @param hashedPhoneNumber Hashed phone number (hashed with SHA1, SHA256, or MD5).
 * @param hashedPinnerId Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
 * @param ipAddress IP address (not hashed).
 * @param liverampEnvelope LiveRamp envelope identifier (Base64-encoded, not hashed).
 * @param maid Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
 * @param userAgent User agent string (not hashed).
 */
data class CustomerListRecordRow(

    @Schema(description = "Email address (plain or hashed with SHA1, SHA256, or MD5).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("email")
    @get:JsonProperty("email") val email: kotlin.String? = null,

    @Schema(description = "External ID identifier (not hashed).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("external_id")
    @get:JsonProperty("external_id") val externalId: kotlin.String? = null,

    @Schema(description = "Hashed phone number (hashed with SHA1, SHA256, or MD5).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hashed_phone_number")
    @get:JsonProperty("hashed_phone_number") val hashedPhoneNumber: kotlin.String? = null,

    @Schema(description = "Hashed pinner ID (hashed with SHA1, SHA256, or MD5).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("hashed_pinner_id")
    @get:JsonProperty("hashed_pinner_id") val hashedPinnerId: kotlin.String? = null,

    @Schema(description = "IP address (not hashed).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ip_address")
    @get:JsonProperty("ip_address") val ipAddress: kotlin.String? = null,

    @Schema(description = "LiveRamp envelope identifier (Base64-encoded, not hashed).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("liveramp_envelope")
    @get:JsonProperty("liveramp_envelope") val liverampEnvelope: kotlin.String? = null,

    @Schema(description = "Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("maid")
    @get:JsonProperty("maid") val maid: kotlin.String? = null,

    @Schema(description = "User agent string (not hashed).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_agent")
    @get:JsonProperty("user_agent") val userAgent: kotlin.String? = null
) {

}

