package org.openapitools.server.api.model

import org.openapitools.server.api.model.ContentType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceImagesBase64Item(
    val contentType: ContentType,
    val `data`: kotlin.String,
    val description: kotlin.String? = null,
    val link: kotlin.String? = null,
    val title: kotlin.String? = null
)
