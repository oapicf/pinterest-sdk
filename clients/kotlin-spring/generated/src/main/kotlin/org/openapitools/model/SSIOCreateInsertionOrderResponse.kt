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
 * 
 * @param pinOrderId Salesforce order id
 */
data class SSIOCreateInsertionOrderResponse(

    @Schema(example = "null", description = "Salesforce order id")
    @get:JsonProperty("pin_order_id") val pinOrderId: kotlin.String? = null
) {

}

