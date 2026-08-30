package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
data class AiDisclosuresUpdate(

    @field:Valid
    @Schema(description = "List of AI disclosure declarations the creator has made about this Pin.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("values")
    @get:JsonProperty("values") val propertyValues: kotlin.collections.List<AiDisclosureItem>? = null
) {

}

