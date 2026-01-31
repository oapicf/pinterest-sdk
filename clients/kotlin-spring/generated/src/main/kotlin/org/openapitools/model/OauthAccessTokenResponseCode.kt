package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
 * @param accessToken 
 * @param expiresIn 
 * @param scope 
 * @param tokenType 
 * @param refreshToken 
 * @param refreshTokenExpiresAt 
 * @param refreshTokenExpiresIn 
 * @param responseType 
 */
data class OauthAccessTokenResponseCode(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("access_token", required = true) val accessToken: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("expires_in", required = true) val expiresIn: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("scope", required = true) val scope: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("token_type", required = true) val tokenType: kotlin.String = "bearer",

    @Schema(example = "null", description = "")
    @get:JsonProperty("refresh_token") val refreshToken: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refresh_token_expires_at") val refreshTokenExpiresAt: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("refresh_token_expires_in") val refreshTokenExpiresIn: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("response_type") val responseType: OauthAccessTokenResponseCode.ResponseType? = null
) {

    /**
    * 
    * Values: authorization_code,refresh_token,client_credentials
    */
    enum class ResponseType(@get:JsonValue val value: kotlin.String) {

        authorization_code("authorization_code"),
        refresh_token("refresh_token"),
        client_credentials("client_credentials");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ResponseType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'OauthAccessTokenResponseCode'")
            }
        }
    }

}

