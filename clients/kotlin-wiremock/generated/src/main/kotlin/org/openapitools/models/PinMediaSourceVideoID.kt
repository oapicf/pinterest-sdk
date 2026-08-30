@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaSourceVideoID(
    @field:JsonProperty("media_id")
    val mediaId: kotlin.String,

    @field:JsonProperty("source_type")
    val sourceType: kotlin.String,

    @field:JsonProperty("cover_image_content_type")
    val coverImageContentType: ContentType? = null,

    @field:JsonProperty("cover_image_data")
    val coverImageData: kotlin.String? = null,

    @field:JsonProperty("cover_image_key_frame_time")
    val coverImageKeyFrameTime: kotlin.Int? = null,

    @field:JsonProperty("cover_image_url")
    val coverImageUrl: kotlin.String? = null,

    @field:JsonProperty("is_standard")
    val isStandard: kotlin.Boolean? = true,

)
