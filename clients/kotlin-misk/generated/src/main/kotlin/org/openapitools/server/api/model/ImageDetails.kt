package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ImageDetails(
    val height: kotlin.Int,
    val url: kotlin.String,
    val width: kotlin.Int
)
