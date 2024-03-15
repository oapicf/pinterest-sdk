package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OauthAccessTokenRequest
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
 * A request to exchange a refresh token for a new access token.
 * @param refreshToken 
 * @param scope 
 * @param refreshOn Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
 */
data class OauthAccessTokenRequestRefresh(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("refresh_token", required = true) val refreshToken: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("grant_type", required = true) override val grantType: OauthAccessTokenRequestRefresh.GrantType,

    @Schema(example = "null", description = "")
    @get:JsonProperty("scope") val scope: kotlin.String? = null,

    @Schema(example = "null", description = "Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".")
    @get:JsonProperty("refresh_on") val refreshOn: kotlin.Boolean? = null
) : OauthAccessTokenRequest{

}

