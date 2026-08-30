package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinMediaSourceImagesURLItem(
    val url: kotlin.String,
    val description: kotlin.String? = null,
    val link: kotlin.String? = null,
    val title: kotlin.String? = null
)
