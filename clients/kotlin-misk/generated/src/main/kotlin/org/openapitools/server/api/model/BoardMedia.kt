package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardMedia(
    /** Board cover image */
    val imageCoverUrl: kotlin.String? = null,
    /** Board pin thumbnail urls. */
    val pinThumbnailUrls: kotlin.collections.List<kotlin.String>? = null
)
