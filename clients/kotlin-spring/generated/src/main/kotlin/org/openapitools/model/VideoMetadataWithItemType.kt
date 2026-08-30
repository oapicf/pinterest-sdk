package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * @param itemType Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
 * @param coverImageUrl 
 * @param duration Duration (in miliseconds). Field maybe null after creation due to video processing time.
 * @param height Height (in pixels). Field maybe null after creation due to video processing time.
 * @param videoUrl Video url (720p).  **Note:** This field is limited and not available to all apps.
 * @param videoUrlHls Video url (HLS).  **Note:** This field is limited and not available to all apps.
 * @param width Width (in pixels). Field maybe null after creation due to video processing time.
 */
data class VideoMetadataWithItemType(

    @Schema(required = true, description = "Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.")
    @param:JsonProperty("item_type")
    @get:JsonProperty("item_type", required = true) override val itemType: VideoMetadataWithItemType.ItemType = kotlin.String.video,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("cover_image_url")
    @get:JsonProperty("cover_image_url") val coverImageUrl: kotlin.String? = null,

    @Schema(description = "Duration (in miliseconds). Field maybe null after creation due to video processing time.")
    @param:JsonProperty("duration")
    @get:JsonProperty("duration") val duration: java.math.BigDecimal? = null,

    @Schema(description = "Height (in pixels). Field maybe null after creation due to video processing time.")
    @param:JsonProperty("height")
    @get:JsonProperty("height") val height: kotlin.Int? = null,

    @Schema(description = "Video url (720p).  **Note:** This field is limited and not available to all apps.")
    @param:JsonProperty("video_url")
    @get:JsonProperty("video_url") val videoUrl: kotlin.String? = null,

    @Schema(description = "Video url (HLS).  **Note:** This field is limited and not available to all apps.")
    @param:JsonProperty("video_url_hls")
    @get:JsonProperty("video_url_hls") val videoUrlHls: kotlin.String? = null,

    @Schema(description = "Width (in pixels). Field maybe null after creation due to video processing time.")
    @param:JsonProperty("width")
    @get:JsonProperty("width") val width: kotlin.Int? = null
) : PinMediaMetadata {

    /**
    * Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
    * Values: video
    */
    enum class ItemType(@get:JsonValue val value: kotlin.String) {

        video("video");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ItemType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ItemType'")
            }
        }
    }

}

