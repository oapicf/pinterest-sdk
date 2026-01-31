package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ImageSize
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
 * Pin with video.
 * @param mediaType 
 * @param coverImageUrl 
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @param height Height (in pixels). Field maybe null after creation due to video processing time.
 * @param images 
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @param width Width (in pixels). Field maybe null after creation due to video processing time.
 */
data class PinMediaWithVideo(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("media_type", required = true) val mediaType: PinMediaWithVideo.MediaType,

    @Schema(example = "null", description = "")
    @get:JsonProperty("cover_image_url") val coverImageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
    @get:JsonProperty("duration") val duration: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Height (in pixels). Field maybe null after creation due to video processing time.")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("images") val images: ImageSize? = null,

    @Schema(example = "null", description = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
    @get:JsonProperty("video_url") val videoUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Width (in pixels). Field maybe null after creation due to video processing time.")
    @get:JsonProperty("width") val width: kotlin.Int? = null
) {

    /**
    * 
    * Values: video
    */
    enum class MediaType(@get:JsonValue val value: kotlin.String) {

        video("video");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): MediaType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PinMediaWithVideo'")
            }
        }
    }

}

