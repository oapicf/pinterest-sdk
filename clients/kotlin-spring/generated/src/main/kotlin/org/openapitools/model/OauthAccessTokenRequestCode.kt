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
 * A request to exchange an authorization code for an access token.
 * @param code 
 * @param redirectUri 
 */
data class OauthAccessTokenRequestCode(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("code", required = true) val code: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("redirect_uri", required = true) val redirectUri: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("grant_type", required = true) override val grantType: OauthAccessTokenRequestCode.GrantType
) : OauthAccessTokenRequest{

}

