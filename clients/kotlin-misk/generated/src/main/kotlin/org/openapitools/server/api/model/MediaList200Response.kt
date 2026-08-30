package org.openapitools.server.api.model

import org.openapitools.server.api.model.Media
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MediaList200Response(
    val items: kotlin.collections.List<Media>,
    val bookmark: kotlin.String? = null
)
