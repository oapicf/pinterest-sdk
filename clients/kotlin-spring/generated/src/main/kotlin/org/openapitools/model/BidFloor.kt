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
 * @param bidFloors A list of bid floors in micro currency. For example, [100000, 200000]
 * @param type Always the string 'bidfloor'
 */
data class BidFloor(

    @Schema(example = "[100000,200000]", description = "A list of bid floors in micro currency. For example, [100000, 200000]")
    @get:JsonProperty("bid_floors") val bidFloors: kotlin.collections.List<kotlin.Int>? = null,

    @Schema(example = "bidfloor", description = "Always the string 'bidfloor'")
    @get:JsonProperty("type") val type: kotlin.String? = "bidfloor"
    ) {

}

