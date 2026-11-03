package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TokenGrantType
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
 * Describes the valid schema for possible OAuth access token requests.
 * @param accessToken 
 * @param expiresIn 
 * @param tokenType 
 * @param refreshToken 
 * @param refreshTokenExpiresAt 
 * @param refreshTokenExpiresIn 
 * @param responseType 
 * @param scope 
 */
data class OauthAccessToken(

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("access_token", required = true)
    @get:JsonProperty("access_token", required = true) val accessToken: kotlin.String,

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("expires_in", required = true)
    @get:JsonProperty("expires_in", required = true) val expiresIn: kotlin.Int,

    @Schema(required = true, readOnly = true, description = "")
    @param:JsonProperty("token_type", required = true)
    @get:JsonProperty("token_type", required = true) val tokenType: kotlin.String = "bearer",

    @Schema(description = "")
    @param:JsonProperty("refresh_token")
    @get:JsonProperty("refresh_token") val refreshToken: kotlin.String? = null,

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("refresh_token_expires_at")
    @get:JsonProperty("refresh_token_expires_at") val refreshTokenExpiresAt: kotlin.Int? = null,

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("refresh_token_expires_in")
    @get:JsonProperty("refresh_token_expires_in") val refreshTokenExpiresIn: kotlin.Int? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @param:JsonProperty("response_type")
    @get:JsonProperty("response_type") val responseType: TokenGrantType? = null,

    @Schema(description = "")
    @param:JsonProperty("scope")
    @get:JsonProperty("scope") val scope: kotlin.String? = null
) {

}

