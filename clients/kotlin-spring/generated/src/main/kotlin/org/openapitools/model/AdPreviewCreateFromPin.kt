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
 * @param pinId Pin ID.
 */
data class AdPreviewCreateFromPin(

    @Schema(example = "7389479023", required = true, description = "Pin ID.")
    @get:JsonProperty("pin_id", required = true) val pinId: kotlin.String
    ) {

}

