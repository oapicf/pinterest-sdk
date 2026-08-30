package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinMediaMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaWithImageAndVideo(
    val mediaType: kotlin.String,
    val items: kotlin.collections.List<PinMediaMetadata>? = null
)
