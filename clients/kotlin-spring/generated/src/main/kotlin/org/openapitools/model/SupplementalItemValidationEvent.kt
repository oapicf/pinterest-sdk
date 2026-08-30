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
 * Item validation event
 * @param attribute The item attribute referenced by the validation event eg. price, availability, ad_link
 * @param code The event code that the item validation event references
 * @param message Title message describing the item validation event
 */
data class SupplementalItemValidationEvent(

    @Schema(example = "price", required = true, description = "The item attribute referenced by the validation event eg. price, availability, ad_link")
    @param:JsonProperty("attribute")
    @get:JsonProperty("attribute", required = true) val attribute: kotlin.String,

    @Schema(example = "113", required = true, description = "The event code that the item validation event references")
    @param:JsonProperty("code")
    @get:JsonProperty("code", required = true) val code: kotlin.Int,

    @Schema(example = "Some supplemental item data was not published due to incorrect formatting", required = true, description = "Title message describing the item validation event")
    @param:JsonProperty("message")
    @get:JsonProperty("message", required = true) val message: kotlin.String
) {

}

