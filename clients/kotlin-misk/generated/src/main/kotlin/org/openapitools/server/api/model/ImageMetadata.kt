package org.openapitools.server.api.model

import org.openapitools.server.api.model.ImageSize
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageMetadata(
    /** Discriminator literal identifying this as image metadata inside a &#x60;PinMediaMetadata&#x60; payload. */
    val itemType: kotlin.String,
    val description: kotlin.String? = null,
    val images: ImageSize? = null,
    val link: kotlin.String? = null,
    val title: kotlin.String? = null
)
