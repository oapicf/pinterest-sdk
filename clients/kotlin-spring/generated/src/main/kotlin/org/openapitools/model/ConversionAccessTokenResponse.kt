package org.openapitools.model

import java.util.Objects
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
 * A successful conversion access token response.
 * @param accessToken 
 * @param tokenType 
 */
data class ConversionAccessTokenResponse(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("access_token", required = true) val accessToken: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("token_type") val tokenType: kotlin.String? = "conversion"
) {

}

