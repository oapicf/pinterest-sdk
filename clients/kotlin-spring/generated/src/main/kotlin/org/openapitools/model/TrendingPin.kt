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
 * Pin image data for trending topics
 * @param height Height of the pin image in pixels
 * @param id Unique identifier for the pin
 * @param src URL of the pin image
 * @param width Width of the pin image in pixels
 */
data class TrendingPin(

    @Schema(example = "null", required = true, description = "Height of the pin image in pixels")
    @get:JsonProperty("height", required = true) val height: kotlin.Int,

    @Schema(example = "null", required = true, description = "Unique identifier for the pin")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "null", required = true, description = "URL of the pin image")
    @get:JsonProperty("src", required = true) val src: kotlin.String,

    @Schema(example = "null", required = true, description = "Width of the pin image in pixels")
    @get:JsonProperty("width", required = true) val width: kotlin.Int
) {

}

