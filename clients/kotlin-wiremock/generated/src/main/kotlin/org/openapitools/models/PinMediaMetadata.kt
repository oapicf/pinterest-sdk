@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinMediaMetadata(
    @field:JsonProperty("item_type")
    val itemType: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("images")
    val images: ImageSize? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

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

)
