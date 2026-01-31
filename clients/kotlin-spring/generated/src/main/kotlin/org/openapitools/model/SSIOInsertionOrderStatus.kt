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
 * @param status Salesforce insertion order status
 * @param creationTime Salesforce insertion order creation time
 */
data class SSIOInsertionOrderStatus(

    @Schema(example = "0Q01N0000015hekSAB", description = "Salesforce order id")
    @get:JsonProperty("pin_order_id") val pinOrderId: kotlin.String? = null,

    @Schema(example = "Approved", description = "Salesforce insertion order status")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(example = "2017-06-21T23:11:11.000Z", description = "Salesforce insertion order creation time")
    @get:JsonProperty("creation_time") val creationTime: kotlin.String? = null
) {

}

