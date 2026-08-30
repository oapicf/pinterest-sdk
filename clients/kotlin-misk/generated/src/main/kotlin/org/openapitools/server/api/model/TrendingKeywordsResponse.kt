package org.openapitools.server.api.model

import org.openapitools.server.api.model.TrendingKeyword
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendingKeywordsResponse(
    /** The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend. */
    val trends: kotlin.collections.List<TrendingKeyword>? = null
)
