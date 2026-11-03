package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.IneligibleProductTagsErrorDetails
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
 * Error response for requests containing ineligible product tags.
 * @param code 
 * @param message 
 * @param details Details about which product tags failed eligibility check.
 */
data class ProductTagsError(

    @Schema(required = true, description = "")
    @param:JsonProperty("code", required = true)
    @get:JsonProperty("code", required = true) val code: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("message", required = true)
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @field:Valid
    @Schema(description = "Details about which product tags failed eligibility check.")
    @param:JsonProperty("details")
    @get:JsonProperty("details") val details: IneligibleProductTagsErrorDetails? = null
) {

}

