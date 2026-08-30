@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMedia(
    @field:JsonProperty("media_type")
    val mediaType: kotlin.String,

    @field:JsonProperty("images")
    val images: ImageSize? = null,

    @field:JsonProperty("cover_image_url")
    val coverImageUrl: kotlin.String? = null,

    @field:JsonProperty("duration")
    val duration: java.math.BigDecimal? = null,

    @field:JsonProperty("height")
    val height: kotlin.Int? = null,

    @field:JsonProperty("video_url")
    val videoUrl: kotlin.String? = null,

    @field:JsonProperty("video_url_hls")
    val videoUrlHls: kotlin.String? = null,

    @field:JsonProperty("width")
    val width: kotlin.Int? = null,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<PinMediaMetadata>? = null,

)
