package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ContentType
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
 * Video ID-based media source.
 * @param mediaId 
 * @param sourceType 
 * @param coverImageContentType Content type for cover image Base64.
 * @param coverImageData Cover image Base64.
 * @param coverImageKeyFrameTime Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
 * @param coverImageUrl Cover image URL.
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
data class PinMediaSourceVideoID(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("media_id", required = true) val mediaId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source_type", required = true) val sourceType: PinMediaSourceVideoID.SourceType,

    @field:Valid
    @Schema(example = "null", description = "Content type for cover image Base64.")
    @get:JsonProperty("cover_image_content_type") val coverImageContentType: ContentType? = null,

    @Schema(example = "null", description = "Cover image Base64.")
    @get:JsonProperty("cover_image_data") val coverImageData: kotlin.String? = null,

    @get:Min(value=0)
    @Schema(example = "null", description = "Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.")
    @get:JsonProperty("cover_image_key_frame_time") val coverImageKeyFrameTime: kotlin.Int? = null,

    @Schema(example = "null", description = "Cover image URL.")
    @get:JsonProperty("cover_image_url") val coverImageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
    @get:JsonProperty("is_standard") val isStandard: kotlin.Boolean? = true
) {

    /**
    * 
    * Values: video_id
    */
    enum class SourceType(@get:JsonValue val value: kotlin.String) {

        video_id("video_id");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): SourceType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PinMediaSourceVideoID'")
            }
        }
    }

}

