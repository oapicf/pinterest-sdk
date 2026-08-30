@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BoardMedia(
    @field:JsonProperty("image_cover_url")
    val imageCoverUrl: kotlin.String? = null,

    @field:JsonProperty("pin_thumbnail_urls")
    val pinThumbnailUrls: kotlin.collections.List<kotlin.String>? = null,

)
