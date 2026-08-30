package org.openapitools.server.api.model

import org.openapitools.server.api.model.ImageDetails
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageSize(
    val `1200x`: ImageDetails? = null,
    val `150x150`: ImageDetails? = null,
    val `400x300`: ImageDetails? = null,
    val `600x`: ImageDetails? = null
)
