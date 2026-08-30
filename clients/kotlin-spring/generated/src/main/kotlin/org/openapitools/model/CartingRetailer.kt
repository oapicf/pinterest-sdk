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
 * @param retailerId Unique identifier for the retailer
 * @param retailerName Name of the retailer
 */
data class CartingRetailer(

    @Schema(required = true, description = "Unique identifier for the retailer")
    @param:JsonProperty("retailer_id")
    @get:JsonProperty("retailer_id", required = true) val retailerId: kotlin.String,

    @Schema(required = true, description = "Name of the retailer")
    @param:JsonProperty("retailer_name")
    @get:JsonProperty("retailer_name", required = true) val retailerName: kotlin.String
) {

}

