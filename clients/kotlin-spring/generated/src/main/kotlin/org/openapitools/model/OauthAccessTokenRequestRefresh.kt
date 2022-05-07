package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OauthAccessTokenRequest
import org.openapitools.model.OauthAccessTokenRequestRefreshAllOf
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A request to exchange a refresh token for a new access token.
 * @param refreshToken 
 * @param scope 
 */
data class OauthAccessTokenRequestRefresh(

    @field:JsonProperty("refresh_token", required = true) val refreshToken: kotlin.String,

    @field:JsonProperty("grant_type", required = true) override val grantType: OauthAccessTokenRequestRefresh.GrantType,

    @field:JsonProperty("scope") val scope: kotlin.String? = null
) : OauthAccessTokenRequest{

}

