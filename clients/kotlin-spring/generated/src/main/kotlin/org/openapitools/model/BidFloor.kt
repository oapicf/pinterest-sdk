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
 * Bid floor request and response model.
 * @param bidFloors A list of bid floors in micro currency. For example, [100000, 200000]
 * @param type Always the string 'bidfloor'.
 */
data class BidFloor(

    @Schema(example = "[100000,200000]", readOnly = true, description = "A list of bid floors in micro currency. For example, [100000, 200000]")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bid_floors")
    @get:JsonProperty("bid_floors") val bidFloors: kotlin.collections.List<kotlin.Int>? = null,

    @Schema(example = "bidfloor", readOnly = true, description = "Always the string 'bidfloor'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("type")
    @get:JsonProperty("type") val type: kotlin.String? = "bidfloor"
) {

}

