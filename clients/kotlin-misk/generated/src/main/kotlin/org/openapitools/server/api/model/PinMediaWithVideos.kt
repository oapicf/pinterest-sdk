package org.openapitools.server.api.model

import org.openapitools.server.api.model.VideoMetadataWithItemType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaWithVideos(
    val mediaType: kotlin.String,
    val items: kotlin.collections.List<VideoMetadataWithItemType>? = null
)
