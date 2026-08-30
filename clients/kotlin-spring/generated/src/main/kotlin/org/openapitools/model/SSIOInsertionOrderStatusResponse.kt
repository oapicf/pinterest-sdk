package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * SSIO insertion order status response for a single pin order id lookup.
 * @param creationTime Salesforce insertion order creation time
 * @param pinOrderId Salesforce order id
 * @param status Salesforce insertion order status
 */
data class SSIOInsertionOrderStatusResponse(

    @Schema(example = "2017-06-21T23:11:11.000Z", description = "Salesforce insertion order creation time")
    @param:JsonProperty("creation_time")
    @get:JsonProperty("creation_time") val creationTime: kotlin.String? = null,

    @Schema(example = "0Q01N0000015hekSAB", description = "Salesforce order id")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("pin_order_id")
    @get:JsonProperty("pin_order_id") val pinOrderId: kotlin.String? = null,

    @Schema(example = "Approved", description = "Salesforce insertion order status")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: kotlin.String? = null
) {

}

