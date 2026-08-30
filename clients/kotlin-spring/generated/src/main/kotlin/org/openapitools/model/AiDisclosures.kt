package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AiDisclosureItem
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
 * AI disclosure declarations the creator has made about the Pin.
 * @param propertyValues List of AI disclosure declarations the creator has made about this Pin.
 */
data class AiDisclosures(

    @field:Valid
    @Schema(required = true, description = "List of AI disclosure declarations the creator has made about this Pin.")
    @param:JsonProperty("values")
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<AiDisclosureItem>
) {

}

