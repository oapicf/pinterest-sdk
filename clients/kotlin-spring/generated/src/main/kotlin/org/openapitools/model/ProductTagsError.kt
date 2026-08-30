package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
    @param:JsonProperty("code")
    @get:JsonProperty("code", required = true) val code: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("message")
    @get:JsonProperty("message", required = true) val message: kotlin.String,

    @field:Valid
    @Schema(description = "Details about which product tags failed eligibility check.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("details")
    @get:JsonProperty("details") val details: IneligibleProductTagsErrorDetails? = null
) {

}

