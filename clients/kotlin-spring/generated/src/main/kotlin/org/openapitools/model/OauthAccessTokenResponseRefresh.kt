package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OauthAccessTokenResponse
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
 * A successful OAuth access token response for the refresh token flow.
 */
class OauthAccessTokenResponseRefresh(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("access_token", required = true) override val accessToken: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("token_type", required = true) override val tokenType: kotlin.String = "bearer",

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("expires_in", required = true) override val expiresIn: kotlin.Int,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("scope", required = true) override val scope: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("response_type") override val responseType: OauthAccessTokenResponseRefresh.ResponseType? = null
) : OauthAccessTokenResponse{

}

