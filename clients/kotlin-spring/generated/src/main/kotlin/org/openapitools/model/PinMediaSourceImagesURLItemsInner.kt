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
 * @param url URL of image to upload.
 * @param title 
 * @param description 
 * @param link Destination link for the image.
 */
data class PinMediaSourceImagesURLItemsInner(

    @Schema(example = "null", required = true, description = "URL of image to upload.")
    @get:JsonProperty("url", required = true) val url: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Destination link for the image.")
    @get:JsonProperty("link") val link: kotlin.String? = null
    ) {

}

