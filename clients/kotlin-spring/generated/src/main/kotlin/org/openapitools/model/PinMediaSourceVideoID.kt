package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * Video ID-based media source
 * @param sourceType 
 * @param mediaId 
 * @param coverImageUrl Cover image url.
 * @param coverImageContentType Content type for cover image Base64.
 * @param coverImageData Cover image Base64.
 * @param isStandard Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
 */
data class PinMediaSourceVideoID(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source_type", required = true) val sourceType: PinMediaSourceVideoID.SourceType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("media_id", required = true) val mediaId: kotlin.String,

    @Schema(example = "null", description = "Cover image url.")
    @get:JsonProperty("cover_image_url") val coverImageUrl: kotlin.String? = null,

    @Schema(example = "null", description = "Content type for cover image Base64.")
    @get:JsonProperty("cover_image_content_type") val coverImageContentType: PinMediaSourceVideoID.CoverImageContentType? = null,

    @Schema(example = "null", description = "Cover image Base64.")
    @get:JsonProperty("cover_image_data") val coverImageData: kotlin.String? = null,

    @Schema(example = "null", description = "Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.")
    @get:JsonProperty("is_standard") val isStandard: kotlin.Boolean? = true
) {

    /**
    * 
    * Values: video_id
    */
    enum class SourceType(val value: kotlin.String) {

        @JsonProperty("video_id") video_id("video_id")
    }

    /**
    * Content type for cover image Base64.
    * Values: jpeg,png
    */
    enum class CoverImageContentType(val value: kotlin.String) {

        @JsonProperty("image/jpeg") jpeg("image/jpeg"),
        @JsonProperty("image/png") png("image/png")
    }

}

