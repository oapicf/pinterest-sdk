package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrderLine
import org.openapitools.model.OrderLineMutationError
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
data class OrderLineMutationResult(

    @field:Valid
    @Schema(description = "Error list if update(s) fail.")
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<OrderLineMutationError>? = null,

    @field:Valid
    @Schema(description = "Order Line object array.")
    @param:JsonProperty("order_line")
    @get:JsonProperty("order_line") val orderLine: kotlin.collections.List<OrderLine>? = null
) {

}

