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
 * Pin image data for trending topics
 * @param color Dominant color of the pin image in hex format
 * @param height Height of the pin image in pixels
 * @param id Unique identifier for the pin
 * @param src URL of the pin image
 * @param width Width of the pin image in pixels
 * @param verticalOffset The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.
 */
data class TrendingPin(

    @Schema(required = true, description = "Dominant color of the pin image in hex format")
    @param:JsonProperty("color")
    @get:JsonProperty("color", required = true) val color: kotlin.String,

    @Schema(required = true, description = "Height of the pin image in pixels")
    @param:JsonProperty("height")
    @get:JsonProperty("height", required = true) val height: kotlin.Int,

    @Schema(required = true, description = "Unique identifier for the pin")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(required = true, description = "URL of the pin image")
    @param:JsonProperty("src")
    @get:JsonProperty("src", required = true) val src: kotlin.String,

    @Schema(required = true, description = "Width of the pin image in pixels")
    @param:JsonProperty("width")
    @get:JsonProperty("width", required = true) val width: kotlin.Int,

    @Schema(description = "The vertical offset of the pin image as a percentage from 0 to 100, where 0 is the top of the image and 100 is the bottom.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("vertical_offset")
    @get:JsonProperty("vertical_offset") val verticalOffset: kotlin.Double? = null
) {

}

