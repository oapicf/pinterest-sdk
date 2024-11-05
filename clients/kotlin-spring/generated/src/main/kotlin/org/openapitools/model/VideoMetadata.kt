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
 * @param itemType 
 * @param coverImageUrl 
 * @param videoUrl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @param duration Duration (in milliseconds)
 * @param height Height (in pixels)
 * @param width Width (in pixels)
 */
data class VideoMetadata(

    @Schema(example = "null", description = "")
    @get:JsonProperty("item_type") val itemType: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cover_image_url") val coverImageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.")
    @get:JsonProperty("video_url") val videoUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Duration (in milliseconds)")
    @get:JsonProperty("duration") val duration: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Height (in pixels)")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(example = "null", description = "Width (in pixels)")
    @get:JsonProperty("width") val width: kotlin.Int? = null
    ) {

}

