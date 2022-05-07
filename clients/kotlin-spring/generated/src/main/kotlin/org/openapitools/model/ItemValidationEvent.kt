package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * Object describing an item validation event
 * @param attribute The attribute that the item validation event references
 * @param code The event code that the item validation event references
 * @param message Title message describing the item validation event
 */
data class ItemValidationEvent(

    @field:JsonProperty("attribute") val attribute: kotlin.String? = null,

    @field:JsonProperty("code") val code: kotlin.Int? = null,

    @field:JsonProperty("message") val message: kotlin.String? = null
) {

}

