package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OauthAccessTokenRequest
import org.openapitools.model.OauthAccessTokenRequestCodeAllOf
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * A request to exchange an authorization code for an access token.
 * @param code 
 * @param redirectUri 
 */
data class OauthAccessTokenRequestCode(

    @field:JsonProperty("code", required = true) val code: kotlin.String,

    @field:JsonProperty("redirect_uri", required = true) val redirectUri: kotlin.String,

    @field:JsonProperty("grant_type", required = true) override val grantType: OauthAccessTokenRequestCode.GrantType
) : OauthAccessTokenRequest{

}

