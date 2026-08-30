package org.openapitools.server.api.model

import org.openapitools.server.api.model.ImageMetadata
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaWithImages(
    val mediaType: kotlin.String,
    val items: kotlin.collections.List<ImageMetadata>? = null
)
