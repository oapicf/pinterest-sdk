package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<OrderLineMutationError>? = null,

    @field:Valid
    @Schema(description = "Order Line object array.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("order_line")
    @get:JsonProperty("order_line") val orderLine: kotlin.collections.List<OrderLine>? = null
) {

}

