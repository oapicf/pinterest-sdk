package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedProductCounts(
    /** The number of products successfully ingested from the feed file. */
    val ingested: kotlin.Int? = null,
    /** The number of products in the feed file. */
    val original: kotlin.Int? = null
)
