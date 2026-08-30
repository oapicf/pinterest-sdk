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
 * Product tag request item containing the pin_id of the product to tag.
 * @param pinId Pin ID of the product pin to tag onto the hero pin.
 */
data class ProductTagItem(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Pin ID of the product pin to tag onto the hero pin.")
    @param:JsonProperty("pin_id")
    @get:JsonProperty("pin_id", required = true) val pinId: kotlin.String
) {

}

