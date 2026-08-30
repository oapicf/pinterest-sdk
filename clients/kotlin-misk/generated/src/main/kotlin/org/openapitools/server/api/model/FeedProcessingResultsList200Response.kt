package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedProcessingResult
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FeedProcessingResultsList200Response(
    val items: kotlin.collections.List<CatalogsFeedProcessingResult>,
    val bookmark: kotlin.String? = null
)
