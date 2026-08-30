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
 * Used for including extra details to a base error
 * @param code 
 * @param details 
 * @param message 
 */
data class DetailedError(

    @Schema(required = true, description = "")
    @param:JsonProperty("code")
    @get:JsonProperty("code", required = true) val code: kotlin.Int,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("details")
    @get:JsonProperty("details", required = true) val details: kotlin.Any,

    @Schema(required = true, description = "")
    @param:JsonProperty("message")
    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

}

