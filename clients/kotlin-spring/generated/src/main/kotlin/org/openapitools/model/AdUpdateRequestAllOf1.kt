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
 * @param id The ID of this ad.
 * @param pinId Pin ID. This field may only be updated for draft ads.
 */
data class AdUpdateRequestAllOf1(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "The ID of this ad.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Pin ID. This field may only be updated for draft ads.")
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id") val pinId: kotlin.String? = null
) {

}

