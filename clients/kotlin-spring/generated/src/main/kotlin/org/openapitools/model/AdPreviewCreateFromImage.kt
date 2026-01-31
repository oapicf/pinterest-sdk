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
 * @param imageUrl Image URL.
 * @param title Title displayed below ad.
 */
data class AdPreviewCreateFromImage(

    @Schema(example = "https://somewebsite.com/someimage.jpg", required = true, description = "Image URL.")
    @get:JsonProperty("image_url", required = true) val imageUrl: kotlin.String,

    @Schema(example = "My Preview Image", required = true, description = "Title displayed below ad.")
    @get:JsonProperty("title", required = true) val title: kotlin.String
) {

}

