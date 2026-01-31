package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrderLine
import org.openapitools.model.OrderLineError
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
 * 
 * @param errors Error list if update(s) fail.
 * @param orderLine Order Line object array.
 */
data class OrderLineResponse(

    @field:Valid
    @Schema(example = "null", description = "Error list if update(s) fail.")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<OrderLineError>? = null,

    @field:Valid
    @Schema(example = "null", description = "Order Line object array.")
    @get:JsonProperty("order_line") val orderLine: kotlin.collections.List<OrderLine>? = null
) {

}

