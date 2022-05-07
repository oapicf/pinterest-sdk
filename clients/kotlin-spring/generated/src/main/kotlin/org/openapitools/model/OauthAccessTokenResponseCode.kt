package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OauthAccessTokenResponse
import org.openapitools.model.OauthAccessTokenResponseCodeAllOf
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A successful OAuth access token response for the authorization code flow.
 * @param refreshToken 
 * @param refreshTokenExpiresIn 
 */
data class OauthAccessTokenResponseCode(

    @field:JsonProperty("refresh_token", required = true) val refreshToken: kotlin.String,

    @field:JsonProperty("refresh_token_expires_in", required = true) val refreshTokenExpiresIn: kotlin.Int,

    @field:JsonProperty("access_token", required = true) override val accessToken: kotlin.String,

    @field:JsonProperty("token_type", required = true) override val tokenType: kotlin.String = "bearer",

    @field:JsonProperty("expires_in", required = true) override val expiresIn: kotlin.Int,

    @field:JsonProperty("scope", required = true) override val scope: kotlin.String,

    @field:JsonProperty("response_type") override val responseType: OauthAccessTokenResponseCode.ResponseType? = null
) : OauthAccessTokenResponse{

}

