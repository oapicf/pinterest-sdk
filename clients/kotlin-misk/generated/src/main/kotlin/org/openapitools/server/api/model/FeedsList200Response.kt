package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeed
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FeedsList200Response(
    val items: kotlin.collections.List<CatalogsFeed>,
    val bookmark: kotlin.String? = null
)
